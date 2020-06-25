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
@NoArgsConstructor
@AllArgsConstructor
public class Valider implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   @Getter
   @Setter
   private Long id;
   /*@Getter
   @Setter
   private String heureDisponiblePlus30;*/
   @Getter
   @Setter
   private String date;
   @Getter
   @Setter
   private String id_prestataire;


}
