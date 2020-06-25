package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Journee;
import com.morningstar.tchoin.repositories.JourneeRopository;
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
@RequestMapping({"/listJournees"})
public class JourneeRestService {
   @Autowired
   private JourneeRopository journeeRopository;

   @GetMapping({""})
   public List<Journee> annulers() {
      return this.journeeRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Journee annuler(@PathVariable(name = "id") Long id) {
      return (Journee)this.journeeRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Journee update(@PathVariable(name = "id") Long id, @RequestBody Journee journee) {
      journee.setId(id);
      return (Journee)this.journeeRopository.save(journee);
   }

   @PostMapping({""})
   public Journee saveContenir(@RequestBody Journee contenir) {
      return (Journee)this.journeeRopository.save(contenir);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.journeeRopository.deleteById(id);
   }
}
