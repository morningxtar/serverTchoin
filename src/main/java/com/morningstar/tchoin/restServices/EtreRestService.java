package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.*;
import com.morningstar.tchoin.repositories.DisponibiliteRopository;
import com.morningstar.tchoin.repositories.EtreRopository;

import java.util.*;

import com.morningstar.tchoin.repositories.JourneeRopository;
import com.morningstar.tchoin.repositories.SemaineRopository;
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
@RequestMapping({"/listEtres"})
public class EtreRestService {
   @Autowired
   private EtreRopository etreRopository;
   @Autowired
   DisponibiliteRopository disponibiliteRopository;
   @Autowired
   SemaineRopository semaineRopository;
   @Autowired
   JourneeRopository journeeRopository;

   @GetMapping({""})
   public List<Etre> etres() {
      return this.etreRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Etre accessoire(@PathVariable(name = "id") Long id) {
      return (Etre)this.etreRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Etre update(@PathVariable(name = "id") Long id, @RequestBody Etre etre) {
      etre.setId(id);
      return (Etre)this.etreRopository.save(etre);
   }

   @PostMapping({""})
   public Etre saveEtre(@RequestBody Etre etre) {
      return (Etre)this.etreRopository.save(etre);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.etreRopository.deleteById(id);
   }

   @GetMapping({"/search/byDisponibilite"})
   public List<Etre> etres(@RequestParam("disponibilite") Long disponibilite) {
      return this.etreRopository.findEtresByIdDisponibilite(disponibilite);
   }

   //semaine du parestataire
   @GetMapping({"/search/byPrestataireDay"})
   public List<EtreDto> byPrestataireDay(@RequestParam("prestataire_id") Long prestataire_id) {

      List<EtreDto> etreDtos = new ArrayList<>();

      List<Etre> etres = this.etreRopository.findEtresByIdPrestataire(prestataire_id);

      for (int i = 0; i < etres.size(); i++) {
         String jour;
         if(! disponibiliteRopository.getOne(etres.get(i).getIdDisponibilite()).equals(null)){
            jour = semaineRopository.getOne(disponibiliteRopository
                    .getOne(etres.get(i).getIdDisponibilite()).getIdSemaine()).getLibelle();
         }else{
            jour = null;
         }
         EtreDto etreDto = new EtreDto(etres.get(i).getId(),etres.get(i).getIdPrestataire(),jour);

         etreDtos.add(etreDto);
      }

      HashSet<Object> seen = new HashSet<>();
      etreDtos.removeIf(e->!seen.add(e.getJour()));

      return etreDtos ;
   }

   //heure du parestataire
   @GetMapping({"/search/byPrestataireHour"})
   public List<EtreWithHourDto> byPrestataireHour(@RequestParam("prestataire_id") Long prestataire_id) {

      List<EtreWithHourDto> etreWithHourDtos = new ArrayList<>();
      List<Etre> etres = this.etreRopository.findEtresByIdPrestataire(prestataire_id);

      for (int i = 0; i < etres.size(); i++) {
         String journee ;

         if(! disponibiliteRopository.getOne(etres.get(i).getIdDisponibilite()).getIdJournee().equals(null)){
            journee = journeeRopository
                    .getOne(disponibiliteRopository.getOne(etres.get(i).getIdDisponibilite()).getIdJournee()).getLibelle();
         }else{
            journee = null;
         }

         EtreWithHourDto etreWithHourDto = new EtreWithHourDto(etres.get(i).getId(),etres.get(i).getIdPrestataire(),journee);

         etreWithHourDtos.add(etreWithHourDto);
      }

      HashSet<Object> seen = new HashSet<>();
      etreWithHourDtos.removeIf(e->!seen.add(e.getPeriodes()));

      return etreWithHourDtos ;
   }



}
