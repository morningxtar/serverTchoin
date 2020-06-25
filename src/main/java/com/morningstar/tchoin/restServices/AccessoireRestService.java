package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Accessoire;
import com.morningstar.tchoin.repositories.AccessoireRopository;
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
@RequestMapping({"/listAccessoires"})
public class AccessoireRestService {
   @Autowired
   private AccessoireRopository accessoireRopository;

   @GetMapping({""})
   public List<Accessoire> accessoires() {
      return this.accessoireRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Accessoire accessoire(@PathVariable(name = "id") Long id) {
      return (Accessoire)this.accessoireRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Accessoire update(@PathVariable(name = "id") Long id, @RequestBody Accessoire accessoire) {
      accessoire.setId(id);
      return (Accessoire)this.accessoireRopository.save(accessoire);
   }

   @PostMapping({""})
   public Accessoire saveAccessoire(@RequestBody Accessoire accessoire) {
      return (Accessoire)this.accessoireRopository.save(accessoire);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.accessoireRopository.deleteById(id);
   }

   @GetMapping({"/search/byAccessoire"})
   public List<Accessoire> accessoire(@RequestParam("accessoire") String accessoire) {
      return this.accessoireRopository.findAccessoiresByLibelleContains(accessoire);
   }
}
