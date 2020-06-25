package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Noter implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private String note;
   private Long idClient;
   private Long idPrestataire;

   public Long getId() {
      return this.id;
   }

   public String getNote() {
      return this.note;
   }

   public Long getIdClient() {
      return this.idClient;
   }

   public Long getIdPrestataire() {
      return this.idPrestataire;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setNote(final String note) {
      this.note = note;
   }

   public void setIdClient(final Long idClient) {
      this.idClient = idClient;
   }

   public void setIdPrestataire(final Long idPrestataire) {
      this.idPrestataire = idPrestataire;
   }

   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Noter)) {
         return false;
      } else {
         Noter other = (Noter)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label59: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label59;
                  }
               } else if (this$id.equals(other$id)) {
                  break label59;
               }

               return false;
            }

            Object this$note = this.getNote();
            Object other$note = other.getNote();
            if (this$note == null) {
               if (other$note != null) {
                  return false;
               }
            } else if (!this$note.equals(other$note)) {
               return false;
            }

            Object this$idClient = this.getIdClient();
            Object other$idClient = other.getIdClient();
            if (this$idClient == null) {
               if (other$idClient != null) {
                  return false;
               }
            } else if (!this$idClient.equals(other$idClient)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof Noter;
   }

   public int hashCode() {
      //int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $note = this.getNote();
      result = result * 59 + ($note == null ? 43 : $note.hashCode());
      Object $idClient = this.getIdClient();
      result = result * 59 + ($idClient == null ? 43 : $idClient.hashCode());
      Object $idPrestataire = this.getIdPrestataire();
      result = result * 59 + ($idPrestataire == null ? 43 : $idPrestataire.hashCode());
      return result;
   }

   public Noter() {
   }

   public Noter(final Long id, final String note, final Long idClient, final Long idPrestataire) {
      this.id = id;
      this.note = note;
      this.idClient = idClient;
      this.idPrestataire = idPrestataire;
   }

   public String toString() {
      return "Noter(id=" + this.getId() + ", note=" + this.getNote() + ", idClient=" + this.getIdClient() + ", idPrestataire=" + this.getIdPrestataire() + ")";
   }
}
