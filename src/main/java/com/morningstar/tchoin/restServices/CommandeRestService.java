package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Commande;
import com.morningstar.tchoin.entities.CommandeDto;
import com.morningstar.tchoin.entities.Disponibilite;
import com.morningstar.tchoin.repositories.*;

import java.util.ArrayList;
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
@RequestMapping({"/listCommandes"})
public class CommandeRestService {
   @Autowired
   private CommandeRopository commandeRopository;
   @Autowired
   DisponibiliteRopository disponibiliteRopository;
   @Autowired
   SemaineRopository semaineRopository;
   @Autowired
   StatusRepository statusRepository;

   @GetMapping({""})
   public List<Commande> commandes() {
      return this.commandeRopository.findAll();
   }

   @GetMapping({"/{id}"})
   public Commande commande(@PathVariable(name = "id") Long id) {
      return this.commandeRopository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Commande update(@PathVariable(name = "id") Long id, @RequestBody Commande commande) {
      commande.setId(id);
      return (Commande)this.commandeRopository.save(commande);
   }

   @PostMapping({""})
   public Commande saveCommande(@RequestBody Commande commande) {
      return (Commande)this.commandeRopository.save(commande);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.commandeRopository.deleteById(id);
   }

   @GetMapping({"/search/byStatus"})
   public List<Commande> commandesbyStatus(@RequestParam("status") String status) {
      return this.commandeRopository.findCommandesByStatus(status);
   }

   @GetMapping({"/commandes/list"})
   public List<CommandeDto> commandesList() {

      List<Commande> commandeList = this.commandeRopository.findAll();
      List<CommandeDto> commandeDtos = new ArrayList<>();

      for (int i = 0; i < commandeList.size(); i++) {
         String jour ;
         String status;

         if(! disponibiliteRopository.getOne(commandeList.get(i).getIdDisponibilite()).getIdSemaine().equals(null)){
            jour = semaineRopository.getOne(
                    disponibiliteRopository.getOne(commandeList.get(i).getIdDisponibilite())
                            .getIdSemaine())
                    .getLibelle();
         }else{
            jour = null;
         }

         if(! statusRepository.getOne(Long.parseLong(commandeList.get(i).getStatus())).getLibelle().equals(null)){
            status = statusRepository.getOne(Long.valueOf(commandeList.get(i).getStatus())).getLibelle();
         }else{
            status = null;
         }

         CommandeDto commandeDto = new CommandeDto(commandeList.get(i).getId(),status,commandeList.get(i).getStatus(),jour,
                 commandeList.get(i).getIdClient(),commandeList.get(i).getNbreHeure(),
                 commandeList.get(i).getNumero(),commandeList.get(i).getDateCommande(),commandeList.get(i).getPeriode());

         commandeDtos.add(commandeDto);
      }

      return commandeDtos;
   }
}
