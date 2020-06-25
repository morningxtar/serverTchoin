package com.morningstar.tchoin.entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etre implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private Long idPrestataire;
   private Long idDisponibilite;

   //private Map<String, Journee> stringJourneeMap;

   public Long getId() {
      return this.id;
   }

   public Long getIdPrestataire() {
      return this.idPrestataire;
   }

   public Long getIdDisponibilite() {
      return this.idDisponibilite;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setIdPrestataire(final Long idPrestataire) {
      this.idPrestataire = idPrestataire;
   }

   public void setIdDisponibilite(final Long idDisponibilite) {
      this.idDisponibilite = idDisponibilite;
   }

   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Etre)) {
         return false;
      } else {
         Etre other = (Etre)o;
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

            Object this$idDisponibilite = this.getIdDisponibilite();
            Object other$idDisponibilite = other.getIdDisponibilite();
            if (this$idDisponibilite == null) {
               if (other$idDisponibilite != null) {
                  return false;
               }
            } else if (!this$idDisponibilite.equals(other$idDisponibilite)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof Etre;
   }

   public int hashCode() {
      //int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $idPrestataire = this.getIdPrestataire();
      result = result * 59 + ($idPrestataire == null ? 43 : $idPrestataire.hashCode());
      Object $idDisponibilite = this.getIdDisponibilite();
      result = result * 59 + ($idDisponibilite == null ? 43 : $idDisponibilite.hashCode());
      return result;
   }

   public Etre() {
   }

   public Etre(final Long id, final Long idPrestataire, final Long idDisponibilite) {
      this.id = id;
      this.idPrestataire = idPrestataire;
      this.idDisponibilite = idDisponibilite;
   }

   public String toString() {
      return "Etre(id=" + this.getId() + ", idPrestataire=" + this.getIdPrestataire() + ", idDisponibilite=" + this.getIdDisponibilite() + ")";
   }
}
