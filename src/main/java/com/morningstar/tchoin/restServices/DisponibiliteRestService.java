package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Disponibilite;
import com.morningstar.tchoin.repositories.DisponibiliteRopository;
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
@RequestMapping({"/listDisponibilites"})
public class DisponibiliteRestService {
   @Autowired
   private DisponibiliteRopository disponibiliteRopository;

   @GetMapping({""})
   public List<Disponibilite> disponibilites() {
      return this.disponibiliteRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Disponibilite disponibilite(@PathVariable(name = "id") Long id) {
      return (Disponibilite)this.disponibiliteRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Disponibilite update(@PathVariable(name = "id") Long id, @RequestBody Disponibilite disponibilite) {
      disponibilite.setId(id);
      return (Disponibilite)this.disponibiliteRopository.save(disponibilite);
   }

   @PostMapping({""})
   public Disponibilite saveAccessoire(@RequestBody Disponibilite accessoire) {
      return (Disponibilite)this.disponibiliteRopository.save(accessoire);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.disponibiliteRopository.deleteById(id);
   }

   @GetMapping({"/search/bySemaineOrJournee"})
   public List<Disponibilite> disponibilitesOr(@RequestParam("semaine") Long semaine, @RequestParam("journee") Long journee) {
      return this.disponibiliteRopository.findDisponibilitesByIdSemaineOrIdJournee(semaine, journee);
   }

   @GetMapping({"/search/byDisponibiliteId"})
   public Disponibilite byDisponibiliteId(@RequestParam("disponibilite_id") Long disponibilite_id) {
      return this.disponibiliteRopository.findDisponibiliteById( disponibilite_id);
   }
}
