package com.morningstar.tchoin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@AllArgsConstructor
public class CommandeDto implements Serializable {
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
   private String status_id;
   @Getter
   @Setter
   private String Jour;
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
