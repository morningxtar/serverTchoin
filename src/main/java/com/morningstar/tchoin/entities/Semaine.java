package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Semaine implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private String libelle;

   public Long getId() {
      return this.id;
   }

   public String getLibelle() {
      return this.libelle;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setLibelle(final String libelle) {
      this.libelle = libelle;
   }

   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Semaine)) {
         return false;
      } else {
         Semaine other = (Semaine)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
               return false;
            }

            Object this$libelle = this.getLibelle();
            Object other$libelle = other.getLibelle();
            if (this$libelle == null) {
               if (other$libelle != null) {
                  return false;
               }
            } else if (!this$libelle.equals(other$libelle)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof Semaine;
   }

   public int hashCode() {
      //int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $libelle = this.getLibelle();
      result = result * 59 + ($libelle == null ? 43 : $libelle.hashCode());
      return result;
   }

   public Semaine() {
   }

   public Semaine(final Long id, final String libelle) {
      this.id = id;
      this.libelle = libelle;
   }

   public String toString() {
      return "Semaine(id=" + this.getId() + ", libelle=" + this.getLibelle() + ")";
   }
}
