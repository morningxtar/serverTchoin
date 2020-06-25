package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contenir implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private double prix;
   private Long idCommande;
   private Long idPrestataire;
   private Long idPrestation;
   private Long idAccessoire;

   public Long getId() {
      return this.id;
   }

   public double getPrix() {
      return this.prix;
   }

   public Long getIdCommande() {
      return this.idCommande;
   }

   public Long getIdPrestataire() {
      return this.idPrestataire;
   }

   public Long getIdPrestation() {
      return this.idPrestation;
   }

   public Long getIdAccessoire() {
      return this.idAccessoire;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setPrix(final double prix) {
      this.prix = prix;
   }

   public void setIdCommande(final Long idCommande) {
      this.idCommande = idCommande;
   }

   public void setIdPrestataire(final Long idPrestataire) {
      this.idPrestataire = idPrestataire;
   }

   public void setIdPrestation(final Long idPrestation) {
      this.idPrestation = idPrestation;
   }

   public void setIdAccessoire(final Long idAccessoire) {
      this.idAccessoire = idAccessoire;
   }

   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Contenir)) {
         return false;
      } else {
         Contenir other = (Contenir)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label75: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label75;
                  }
               } else if (this$id.equals(other$id)) {
                  break label75;
               }

               return false;
            }

            if (Double.compare(this.getPrix(), other.getPrix()) != 0) {
               return false;
            } else {
               Object this$idCommande = this.getIdCommande();
               Object other$idCommande = other.getIdCommande();
               if (this$idCommande == null) {
                  if (other$idCommande != null) {
                     return false;
                  }
               } else if (!this$idCommande.equals(other$idCommande)) {
                  return false;
               }

               label60: {
                  Object this$idPrestataire = this.getIdPrestataire();
                  Object other$idPrestataire = other.getIdPrestataire();
                  if (this$idPrestataire == null) {
                     if (other$idPrestataire == null) {
                        break label60;
                     }
                  } else if (this$idPrestataire.equals(other$idPrestataire)) {
                     break label60;
                  }

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

               Object this$idAccessoire = this.getIdAccessoire();
               Object other$idAccessoire = other.getIdAccessoire();
               if (this$idAccessoire == null) {
                  if (other$idAccessoire != null) {
                     return false;
                  }
               } else if (!this$idAccessoire.equals(other$idAccessoire)) {
                  return false;
               }

               return true;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof Contenir;
   }

   public int hashCode() {
      //int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      long $prix = Double.doubleToLongBits(this.getPrix());
      result = result * 59 + (int)($prix >>> 32 ^ $prix);
      Object $idCommande = this.getIdCommande();
      result = result * 59 + ($idCommande == null ? 43 : $idCommande.hashCode());
      Object $idPrestataire = this.getIdPrestataire();
      result = result * 59 + ($idPrestataire == null ? 43 : $idPrestataire.hashCode());
      Object $idPrestation = this.getIdPrestation();
      result = result * 59 + ($idPrestation == null ? 43 : $idPrestation.hashCode());
      Object $idAccessoire = this.getIdAccessoire();
      result = result * 59 + ($idAccessoire == null ? 43 : $idAccessoire.hashCode());
      return result;
   }

   public Contenir() {
   }

   public Contenir(final Long id, final double prix, final Long idCommande, final Long idPrestataire, final Long idPrestation, final Long idAccessoire) {
      this.id = id;
      this.prix = prix;
      this.idCommande = idCommande;
      this.idPrestataire = idPrestataire;
      this.idPrestation = idPrestation;
      this.idAccessoire = idAccessoire;
   }

   public String toString() {
      return "Contenir(id=" + this.getId() + ", prix=" + this.getPrix() + ", idCommande=" + this.getIdCommande() + ", idPrestataire=" + this.getIdPrestataire() + ", idPrestation=" + this.getIdPrestation() + ", idAccessoire=" + this.getIdAccessoire() + ")";
   }
}
