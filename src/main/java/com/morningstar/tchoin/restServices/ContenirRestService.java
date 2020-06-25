package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Contenir;
import com.morningstar.tchoin.repositories.ContenirRopository;
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
@RequestMapping({"/listContenirs"})
public class ContenirRestService {
   @Autowired
   private ContenirRopository contenirRopository;

   @GetMapping({""})
   public List<Contenir> annulers() {
      return this.contenirRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Contenir annuler(@PathVariable(name = "id") Long id) {
      return (Contenir)this.contenirRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Contenir update(@PathVariable(name = "id") Long id, @RequestBody Contenir annuler) {
      annuler.setId(id);
      return (Contenir)this.contenirRopository.save(annuler);
   }

   @PostMapping({""})
   public Contenir saveContenir(@RequestBody Contenir contenir) {
      return (Contenir)this.contenirRopository.save(contenir);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.contenirRopository.deleteById(id);
   }
}
