package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Semaine;
import com.morningstar.tchoin.repositories.SemaineRopository;
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
@RequestMapping({"/listSemaines"})
public class SemaineRestService {
   @Autowired
   private SemaineRopository semaineRopository;

   @GetMapping({""})
   public List<Semaine> semaines() {
      return this.semaineRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Semaine semaine(@PathVariable(name = "id") Long id) {
      return (Semaine)this.semaineRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Semaine update(@PathVariable(name = "id") Long id, @RequestBody Semaine semaine) {
      semaine.setId(id);
      return (Semaine)this.semaineRopository.save(semaine);
   }

   @PostMapping({""})
   public Semaine saveContenir(@RequestBody Semaine semaine) {
      return (Semaine)this.semaineRopository.save(semaine);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.semaineRopository.deleteById(id);
   }
}
