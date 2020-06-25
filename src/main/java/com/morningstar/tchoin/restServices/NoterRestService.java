package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Noter;
import com.morningstar.tchoin.repositories.NoterRopository;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/listNoters"})
public class NoterRestService {
   @Autowired
   private NoterRopository noterRopository;

   @GetMapping({""})
   public List<Noter> prestataires() {
      return this.noterRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Noter prestataire(@PathVariable(name = "id") Long id) {
      return this.noterRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Noter update(@PathVariable(name = "id") Long id, @RequestBody Noter noter) {
      noter.setId(id);
      return this.noterRopository.save(noter);
   }

   @PostMapping({""})
   public Noter saveNoter(@RequestBody Noter noter) {
      return this.noterRopository.save(noter);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.noterRopository.deleteById(id);
   }

   @GetMapping({"/search/byNote"})
   public List<Noter> noters(@RequestParam("note") String note) {
      return this.noterRopository.findNotersByNote(note);
   }

   @GetMapping({"/search/byNoteGreater"})
   public List<Noter> notersGreater(@RequestParam("note") String note) {
      return this.noterRopository.findNotersByNoteGreaterThanEqual(note);
   }

   @GetMapping({"/search/byNoteLess"})
   public List<Noter> notersUnder(@RequestParam("note") String note) {
      return this.noterRopository.findNotersByNoteLessThanEqual(note);
   }

   @GetMapping({"/search/byPrestataire"})
   public double note(@RequestParam("prestataire") Long prestataire) {
      List<Noter> noters = this.noterRopository.findNotersByIdPrestataire(prestataire);
      double note = 0.0D;

      Noter noter;
      for(Iterator var5 = noters.iterator(); var5.hasNext(); note += Integer.parseInt(noter.getNote())) {
         noter = (Noter)var5.next();
      }

      note /= noters.size();
      double scale = Math.pow(10.0D, 1.0D);
      note = (double)Math.round(note * scale) / scale;
      return note;
   }
}
