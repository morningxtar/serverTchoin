package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photo implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private String photo;
   private Long idPrestataire;

   public Long getId() {
      return this.id;
   }

   public String getPhoto() {
      return this.photo;
   }

   public Long getIdPrestataire() {
      return this.idPrestataire;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setPhoto(final String photo) {
      this.photo = photo;
   }

   public void setIdPrestataire(final Long idPrestataire) {
      this.idPrestataire = idPrestataire;
   }

   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Photo)) {
         return false;
      } else {
         Photo other = (Photo)o;
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

            Object this$photo = this.getPhoto();
            Object other$photo = other.getPhoto();
            if (this$photo == null) {
               if (other$photo != null) {
                  return false;
               }
            } else if (!this$photo.equals(other$photo)) {
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
      return other instanceof Photo;
   }

   public int hashCode() {
      //int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $photo = this.getPhoto();
      result = result * 59 + ($photo == null ? 43 : $photo.hashCode());
      Object $idPrestataire = this.getIdPrestataire();
      result = result * 59 + ($idPrestataire == null ? 43 : $idPrestataire.hashCode());
      return result;
   }

   public Photo() {
   }

   public Photo(final Long id, final String photo, final Long idPrestataire) {
      this.id = id;
      this.photo = photo;
      this.idPrestataire = idPrestataire;
   }

   public String toString() {
      return "Photo(id=" + this.getId() + ", photo=" + this.getPhoto() + ", idPrestataire=" + this.getIdPrestataire() + ")";
   }
}
