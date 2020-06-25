package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Journee implements Serializable {
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
      } else if (!(o instanceof Journee)) {
         return false;
      } else {
         Journee other = (Journee)o;
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
      return other instanceof Journee;
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

   public Journee() {
   }

   public Journee(final Long id, final String libelle) {
      this.id = id;
      this.libelle = libelle;
   }

   public String toString() {
      return "Journee(id=" + this.getId() + ", libelle=" + this.getLibelle() + ")";
   }
}
