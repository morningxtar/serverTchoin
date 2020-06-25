package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prestataire implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private String nom;
   private String prenoms;
   private String nationalite;
   private String dateNaissance;
   private String localite;
   private String contact;
   private String email;
   private double sommeParHeure;
   @Column(
      unique = true
   )
   private String username;
   private String password;

   public Long getId() {
      return this.id;
   }

   public String getNom() {
      return this.nom;
   }

   public String getPrenoms() {
      return this.prenoms;
   }

   public String getNationalite() {
      return this.nationalite;
   }

   public String getDateNaissance() {
      return this.dateNaissance;
   }

   public String getLocalite() {
      return this.localite;
   }

   public String getContact() {
      return this.contact;
   }

   public String getEmail() {
      return this.email;
   }

   public double getSommeParHeure() {
      return this.sommeParHeure;
   }

   public String getUsername() {
      return this.username;
   }

   public String getPassword() {
      return this.password;
   }

   public void setId(final Long id) {
      this.id = id;
   }

   public void setNom(final String nom) {
      this.nom = nom;
   }

   public void setPrenoms(final String prenoms) {
      this.prenoms = prenoms;
   }

   public void setNationalite(final String nationalite) {
      this.nationalite = nationalite;
   }

   public void setDateNaissance(final String dateNaissance) {
      this.dateNaissance = dateNaissance;
   }

   public void setLocalite(final String localite) {
      this.localite = localite;
   }

   public void setContact(final String contact) {
      this.contact = contact;
   }

   public void setEmail(final String email) {
      this.email = email;
   }

   public void setSommeParHeure(final double sommeParHeure) {
      this.sommeParHeure = sommeParHeure;
   }

   public void setUsername(final String username) {
      this.username = username;
   }

   public void setPassword(final String password) {
      this.password = password;
   }

   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Prestataire)) {
         return false;
      } else {
         Prestataire other = (Prestataire)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            label135: {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id == null) {
                     break label135;
                  }
               } else if (this$id.equals(other$id)) {
                  break label135;
               }

               return false;
            }

            Object this$nom = this.getNom();
            Object other$nom = other.getNom();
            if (this$nom == null) {
               if (other$nom != null) {
                  return false;
               }
            } else if (!this$nom.equals(other$nom)) {
               return false;
            }

            label121: {
               Object this$prenoms = this.getPrenoms();
               Object other$prenoms = other.getPrenoms();
               if (this$prenoms == null) {
                  if (other$prenoms == null) {
                     break label121;
                  }
               } else if (this$prenoms.equals(other$prenoms)) {
                  break label121;
               }

               return false;
            }

            Object this$nationalite = this.getNationalite();
            Object other$nationalite = other.getNationalite();
            if (this$nationalite == null) {
               if (other$nationalite != null) {
                  return false;
               }
            } else if (!this$nationalite.equals(other$nationalite)) {
               return false;
            }

            label107: {
               Object this$dateNaissance = this.getDateNaissance();
               Object other$dateNaissance = other.getDateNaissance();
               if (this$dateNaissance == null) {
                  if (other$dateNaissance == null) {
                     break label107;
                  }
               } else if (this$dateNaissance.equals(other$dateNaissance)) {
                  break label107;
               }

               return false;
            }

            Object this$localite = this.getLocalite();
            Object other$localite = other.getLocalite();
            if (this$localite == null) {
               if (other$localite != null) {
                  return false;
               }
            } else if (!this$localite.equals(other$localite)) {
               return false;
            }

            label93: {
               Object this$contact = this.getContact();
               Object other$contact = other.getContact();
               if (this$contact == null) {
                  if (other$contact == null) {
                     break label93;
                  }
               } else if (this$contact.equals(other$contact)) {
                  break label93;
               }

               return false;
            }

            label86: {
               Object this$email = this.getEmail();
               Object other$email = other.getEmail();
               if (this$email == null) {
                  if (other$email == null) {
                     break label86;
                  }
               } else if (this$email.equals(other$email)) {
                  break label86;
               }

               return false;
            }

            if (Double.compare(this.getSommeParHeure(), other.getSommeParHeure()) != 0) {
               return false;
            } else {
               Object this$username = this.getUsername();
               Object other$username = other.getUsername();
               if (this$username == null) {
                  if (other$username != null) {
                     return false;
                  }
               } else if (!this$username.equals(other$username)) {
                  return false;
               }

               Object this$password = this.getPassword();
               Object other$password = other.getPassword();
               if (this$password == null) {
                  if (other$password != null) {
                     return false;
                  }
               } else if (!this$password.equals(other$password)) {
                  return false;
               }

               return true;
            }
         }
      }
   }

   protected boolean canEqual(final Object other) {
      return other instanceof Prestataire;
   }

   public int hashCode() {
      //int PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $nom = this.getNom();
      result = result * 59 + ($nom == null ? 43 : $nom.hashCode());
      Object $prenoms = this.getPrenoms();
      result = result * 59 + ($prenoms == null ? 43 : $prenoms.hashCode());
      Object $nationalite = this.getNationalite();
      result = result * 59 + ($nationalite == null ? 43 : $nationalite.hashCode());
      Object $dateNaissance = this.getDateNaissance();
      result = result * 59 + ($dateNaissance == null ? 43 : $dateNaissance.hashCode());
      Object $localite = this.getLocalite();
      result = result * 59 + ($localite == null ? 43 : $localite.hashCode());
      Object $contact = this.getContact();
      result = result * 59 + ($contact == null ? 43 : $contact.hashCode());
      Object $email = this.getEmail();
      result = result * 59 + ($email == null ? 43 : $email.hashCode());
      long $sommeParHeure = Double.doubleToLongBits(this.getSommeParHeure());
      result = result * 59 + (int)($sommeParHeure >>> 32 ^ $sommeParHeure);
      Object $username = this.getUsername();
      result = result * 59 + ($username == null ? 43 : $username.hashCode());
      Object $password = this.getPassword();
      result = result * 59 + ($password == null ? 43 : $password.hashCode());
      return result;
   }

   public Prestataire() {
   }

   public Prestataire(final Long id, final String nom, final String prenoms, final String nationalite, final String dateNaissance, final String localite, final String contact, final String email, final double sommeParHeure, final String username, final String password) {
      this.id = id;
      this.nom = nom;
      this.prenoms = prenoms;
      this.nationalite = nationalite;
      this.dateNaissance = dateNaissance;
      this.localite = localite;
      this.contact = contact;
      this.email = email;
      this.sommeParHeure = sommeParHeure;
      this.username = username;
      this.password = password;
   }

   public String toString() {
      return "Prestataire(id=" + this.getId() + ", nom=" + this.getNom() + ", prenoms=" + this.getPrenoms() + ", nationalite=" + this.getNationalite() + ", dateNaissance=" + this.getDateNaissance() + ", localite=" + this.getLocalite() + ", contact=" + this.getContact() + ", email=" + this.getEmail() + ", sommeParHeure=" + this.getSommeParHeure() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ")";
   }
}
