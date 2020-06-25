package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Fournir;
import com.morningstar.tchoin.entities.Prestation;
import com.morningstar.tchoin.repositories.FournirRopository;
import com.morningstar.tchoin.repositories.PrestationRopository;
import java.util.ArrayList;
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
@RequestMapping({"/listPrestations"})
public class PrestationRestService {
   @Autowired
   private PrestationRopository prestationRopository;
   @Autowired
   private FournirRopository fournirRopository;

   @GetMapping({""})
   public List<Prestation> prestations() {
      return this.prestationRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Prestation prestation(@PathVariable(name = "id") Long id) {
      return (Prestation)this.prestationRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Prestation update(@PathVariable(name = "id") Long id, @RequestBody Prestation prestation) {
      prestation.setId(id);
      return (Prestation)this.prestationRopository.save(prestation);
   }

   @PostMapping({""})
   public Prestation savePrestation(@RequestBody Prestation prestation) {
      return (Prestation)this.prestationRopository.save(prestation);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.prestationRopository.deleteById(id);
   }

   @GetMapping({"/search/byPrestation"})
   public List<Prestation> accessoire(@RequestParam("prestation") String prestation) {
      return this.prestationRopository.findPrestationsByLibelle(prestation);
   }

   @GetMapping({"/search/byPrestataire"})
   public List<Prestation> prestatations(@RequestParam("prestataire") Long prestataire) {
      List<Prestation> prestations = new ArrayList();
      List<Fournir> fournirs = this.fournirRopository.findFournirsByIdPrestataire(prestataire);
      Iterator var4 = fournirs.iterator();

      while(var4.hasNext()) {
         Fournir fournir = (Fournir)var4.next();
         prestations.add(this.prestationRopository.findPrestationsById(fournir.getIdPrestation()));
      }

      return prestations;
   }
}
