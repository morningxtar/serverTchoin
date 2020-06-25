package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Annuler implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private String motif;
   private Long idPrestataire;
   private Long idCommande;

   public Long getId() {
      return this.id;
   }

   public String getMotif() {
      return this.motif;
   }

   public Long getIdPrestataire() {
      return this.idPrestataire;
   }

   public Long getIdCommande() {
      return this.idCommande;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setMotif(final String motif) {
      this.motif = motif;
   }

   public void setIdPrestataire(final Long idPrestataire) {
      this.idPrestataire = idPrestataire;
   }

   public void setIdCommande(final Long idCommande) {
      this.idCommande = idCommande;
   }

   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Annuler)) {
         return false;
      } else {
         Annuler other = (Annuler)o;
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

            Object this$motif = this.getMotif();
            Object other$motif = other.getMotif();
            if (this$motif == null) {
               if (other$motif != null) {
                  return false;
               }
            } else if (!this$motif.equals(other$motif)) {
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

            Object this$idCommande = this.getIdCommande();
            Object other$idCommande = other.getIdCommande();
            if (this$idCommande == null) {
               if (other$idCommande != null) {
                  return false;
               }
            } else if (!this$idCommande.equals(other$idCommande)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof Annuler;
   }

   public int hashCode() {
      //int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $motif = this.getMotif();
      result = result * 59 + ($motif == null ? 43 : $motif.hashCode());
      Object $idPrestataire = this.getIdPrestataire();
      result = result * 59 + ($idPrestataire == null ? 43 : $idPrestataire.hashCode());
      Object $idCommande = this.getIdCommande();
      result = result * 59 + ($idCommande == null ? 43 : $idCommande.hashCode());
      return result;
   }

   public Annuler() {
   }

   public Annuler(final Long id, final String motif, final Long idPrestataire, final Long idCommande) {
      this.id = id;
      this.motif = motif;
      this.idPrestataire = idPrestataire;
      this.idCommande = idCommande;
   }

   public String toString() {
      return "Annuler(id=" + this.getId() + ", motif=" + this.getMotif() + ", idPrestataire=" + this.getIdPrestataire() + ", idCommande=" + this.getIdCommande() + ")";
   }
}
