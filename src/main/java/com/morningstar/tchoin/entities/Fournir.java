package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fournir implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private Long idPrestataire;
   private Long idPrestation;

   public Long getId() {
      return this.id;
   }

   public Long getIdPrestataire() {
      return this.idPrestataire;
   }

   public Long getIdPrestation() {
      return this.idPrestation;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setIdPrestataire(final Long idPrestataire) {
      this.idPrestataire = idPrestataire;
   }

   public void setIdPrestation(final Long idPrestation) {
      this.idPrestation = idPrestation;
   }

   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Fournir)) {
         return false;
      } else {
         Fournir other = (Fournir)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label47: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label47;
                  }
               } else if (this$id.equals(other$id)) {
                  break label47;
               }

               return false;
            }

            Object this$idPrestataire = this.getIdPrestataire();
            Object other$idPrestataire = other.getIdPrestataire();
            if (this$idPrestataire == null) {
               if (other$idPrestataire != null) {
                  return false;
               }
            } else if (!this$idPrestataire.equals(other$idPrestataire)) {
               return false;
            }

            Object this$idPrestation = this.getIdPrestation();
            Object other$idPrestation = other.getIdPrestation();
            if (this$idPrestation == null) {
               if (other$idPrestation != null) {
                  return false;
               }
            } else if (!this$idPrestation.equals(other$idPrestation)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof Fournir;
   }

   public int hashCode() {
      //int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $idPrestataire = this.getIdPrestataire();
      result = result * 59 + ($idPrestataire == null ? 43 : $idPrestataire.hashCode());
      Object $idPrestation = this.getIdPrestation();
      result = result * 59 + ($idPrestation == null ? 43 : $idPrestation.hashCode());
      return result;
   }

   public Fournir() {
   }

   public Fournir(final Long id, final Long idPrestataire, final Long idPrestation) {
      this.id = id;
      this.idPrestataire = idPrestataire;
      this.idPrestation = idPrestation;
   }

   public String toString() {
      return "Fournir(id=" + this.getId() + ", idPrestataire=" + this.getIdPrestataire() + ", idPrestation=" + this.getIdPrestation() + ")";
   }
}
