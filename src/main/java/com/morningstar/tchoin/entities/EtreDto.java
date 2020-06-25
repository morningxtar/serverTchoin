package com.morningstar.tchoin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class EtreDto implements Serializable {

   @Getter
   @Setter
   private Long id;
   @Getter
   @Setter
   private Long idPrestataire;
   @Getter
   @Setter
   private String Jour;

}
