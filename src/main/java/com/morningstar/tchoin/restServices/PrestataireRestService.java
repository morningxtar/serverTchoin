package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Prestataire;
import com.morningstar.tchoin.repositories.PrestataireRopository;
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
@RequestMapping({"/listPrestataires"})
public class PrestataireRestService {
   @Autowired
   private PrestataireRopository prestataireRopository;

   @GetMapping({""})
   public List<Prestataire> prestataires() {
      return this.prestataireRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Prestataire prestataire(@PathVariable(name = "id") Long id) {
      return (Prestataire)this.prestataireRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Prestataire update(@PathVariable(name = "id") Long id, @RequestBody Prestataire prestataire) {
      prestataire.setId(id);
      System.out.println(prestataire);
      return (Prestataire)this.prestataireRopository.save(prestataire);
   }

   @PostMapping({""})
   public Prestataire savePrestataire(@RequestBody Prestataire prestataire) {
      return (Prestataire)this.prestataireRopository.save(prestataire);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.prestataireRopository.deleteById(id);
   }

   @GetMapping({"/search/byUsernameAndPassword"})
   public Prestataire prestataire(@RequestParam("username") String username, @RequestParam("password") String password) {
      return this.prestataireRopository.findPrestataireByUsernameAndPassword(username, password);
   }

   @GetMapping({"/search/byNomOrPrenoms"})
   public List<Prestataire> prestataires(@RequestParam("nom") String nom, @RequestParam("prenoms") String prenoms) {
      return this.prestataireRopository.findPrestatairesByNomContainsOrPrenomsContains(nom, prenoms);
   }
}
