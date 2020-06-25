package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accessoire implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private String libelle;
   private double prix;

   public Long getId() {
      return this.id;
   }

   public String getLibelle() {
      return this.libelle;
   }

   public double getPrix() {
      return this.prix;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setLibelle(final String libelle) {
      this.libelle = libelle;
   }

   public void setPrix(final double prix) {
      this.prix = prix;
   }

   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Accessoire)) {
         return false;
      } else {
         Accessoire other = (Accessoire)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label39: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label39;
                  }
               } else if (this$id.equals(other$id)) {
                  break label39;
               }

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

            if (Double.compare(this.getPrix(), other.getPrix()) != 0) {
               return false;
            } else {
               return true;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof Accessoire;
   }

   public int hashCode() {
      //int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $libelle = this.getLibelle();
      result = result * 59 + ($libelle == null ? 43 : $libelle.hashCode());
      long $prix = Double.doubleToLongBits(this.getPrix());
      result = result * 59 + (int)($prix >>> 32 ^ $prix);
      return result;
   }

   public Accessoire() {
   }

   public Accessoire(final Long id, final String libelle, final double prix) {
      this.id = id;
      this.libelle = libelle;
      this.prix = prix;
   }

   public String toString() {
      return "Accessoire(id=" + this.getId() + ", libelle=" + this.getLibelle() + ", prix=" + this.getPrix() + ")";
   }
}
