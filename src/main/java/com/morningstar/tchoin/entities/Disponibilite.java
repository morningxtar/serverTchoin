package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disponibilite implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private Long idSemaine;
   private Long idJournee;

   public Long getId() {
      return this.id;
   }

   public Long getIdSemaine() {
      return this.idSemaine;
   }

   public Long getIdJournee() {
      return this.idJournee;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setIdSemaine(final Long idSemaine) {
      this.idSemaine = idSemaine;
   }

   public void setIdJournee(final Long idJournee) {
      this.idJournee = idJournee;
   }

   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Disponibilite)) {
         return false;
      } else {
         Disponibilite other = (Disponibilite)o;
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

            Object this$idSemaine = this.getIdSemaine();
            Object other$idSemaine = other.getIdSemaine();
            if (this$idSemaine == null) {
               if (other$idSemaine != null) {
                  return false;
               }
            } else if (!this$idSemaine.equals(other$idSemaine)) {
               return false;
            }

            Object this$idJournee = this.getIdJournee();
            Object other$idJournee = other.getIdJournee();
            if (this$idJournee == null) {
               if (other$idJournee != null) {
                  return false;
               }
            } else if (!this$idJournee.equals(other$idJournee)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof Disponibilite;
   }

   public int hashCode() {
      //int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $idSemaine = this.getIdSemaine();
      result = result * 59 + ($idSemaine == null ? 43 : $idSemaine.hashCode());
      Object $idJournee = this.getIdJournee();
      result = result * 59 + ($idJournee == null ? 43 : $idJournee.hashCode());
      return result;
   }

   public Disponibilite() {
   }

   public Disponibilite(final Long id, final Long idSemaine, final Long idJournee) {
      this.id = id;
      this.idSemaine = idSemaine;
      this.idJournee = idJournee;
   }

   public String toString() {
      return "Disponibilite(id=" + this.getId() + ", idSemaine=" + this.getIdSemaine() + ", idJournee=" + this.getIdJournee() + ")";
   }
}
