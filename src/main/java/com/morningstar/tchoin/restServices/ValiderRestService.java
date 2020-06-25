package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Valider;
import com.morningstar.tchoin.repositories.ValiderRopository;
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
@RequestMapping({"/listValiders"})
public class ValiderRestService {
   @Autowired
   private ValiderRopository validerRopository;

   @GetMapping({""})
   public List<Valider> validers() {
      return this.validerRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Valider valider(@PathVariable(name = "id") Long id) {
      return (Valider)this.validerRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Valider update(@PathVariable(name = "id") Long id, @RequestBody Valider valider) {
      valider.setId(id);
      return (Valider)this.validerRopository.save(valider);
   }

   @PostMapping({""})
   public Valider saveValider(@RequestBody Valider valider) {
      return (Valider)this.validerRopository.save(valider);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.validerRopository.deleteById(id);
   }
}
