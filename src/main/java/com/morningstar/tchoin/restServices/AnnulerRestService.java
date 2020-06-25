package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Annuler;
import com.morningstar.tchoin.repositories.AnnulerRopository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/listAnnulers"})
public class AnnulerRestService {
   @Autowired
   private AnnulerRopository annulerRestService;

   @GetMapping({""})
   public List<Annuler> annulers() {
      return this.annulerRestService.findAll();
   }

   @GetMapping({"/{id}"})
   public Annuler annuler(@PathVariable(name = "id") Long id) {
      return (Annuler)this.annulerRestService.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Annuler update(@PathVariable(name = "id") Long id, @RequestBody Annuler annuler) {
      annuler.setId(id);
      return (Annuler)this.annulerRestService.save(annuler);
   }

   @PostMapping({""})
   public Annuler saveAccessoire(@RequestBody Annuler annuler) {
      return (Annuler)this.annulerRestService.save(annuler);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.annulerRestService.deleteById(id);
   }
}
