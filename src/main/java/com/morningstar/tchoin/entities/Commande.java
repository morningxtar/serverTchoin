package com.morningstar.tchoin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Commande implements Serializable {
   @Id
   @Getter
   @Setter
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   @Getter
   @Setter
   private String status;
   @Getter
   @Setter
   private Long idDisponibilite;
   @Getter
   @Setter
   private Long idClient;
   @Getter
   @Setter
   private Long nbreHeure;
   @Getter
   @Setter
   private String numero;
   @Getter
   @Setter
   private String dateCommande;
   @Getter
   @Setter
   private String periode;


}
