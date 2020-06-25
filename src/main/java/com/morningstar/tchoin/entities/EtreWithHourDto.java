package com.morningstar.tchoin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
public class EtreWithHourDto implements Serializable {

   @Getter
   @Setter
   private Long id;
   @Getter
   @Setter
   private Long idPrestataire;
   @Getter
   @Setter
   private String periodes;

}
