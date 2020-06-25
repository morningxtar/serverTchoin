package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Fournir;
import com.morningstar.tchoin.repositories.FournirRopository;
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
@RequestMapping({"/listFournirs"})
public class FournirRestService {
   @Autowired
   private FournirRopository fournirRopository;

   @GetMapping({""})
   public List<Fournir> fournirs() {
      return this.fournirRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Fournir fournir(@PathVariable(name = "id") Long id) {
      return (Fournir)this.fournirRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Fournir update(@PathVariable(name = "id") Long id, @RequestBody Fournir fournir) {
      fournir.setId(id);
      return (Fournir)this.fournirRopository.save(fournir);
   }

   @PostMapping({""})
   public Fournir saveEtre(@RequestBody Fournir etre) {
      return (Fournir)this.fournirRopository.save(etre);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.fournirRopository.deleteById(id);
   }

   @GetMapping({"/search/byPrestation"})
   public List<Fournir> fournirs(@RequestParam("prestation") Long prestation) {
      return this.fournirRopository.findFournirsByIdPrestation(prestation);
   }

   @GetMapping({"/search/byPrestataire"})
   public List<Fournir> fournirsByPrestataire(@RequestParam("prestataire") Long prestation) {
      return this.fournirRopository.findFournirsByIdPrestation(prestation);
   }
}
