package com.morningstar.tchoin.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private String nom;
   private String prenoms;
   private String contact;
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

   public String getContact() {
      return this.contact;
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

   public void setContact(final String contact) {
      this.contact = contact;
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
      } else if (!(o instanceof Client)) {
         return false;
      } else {
         Client other = (Client)o;
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

            Object this$nom = this.getNom();
            Object other$nom = other.getNom();
            if (this$nom == null) {
               if (other$nom != null) {
                  return false;
               }
            } else if (!this$nom.equals(other$nom)) {
               return false;
            }

            Object this$prenoms = this.getPrenoms();
            Object other$prenoms = other.getPrenoms();
            if (this$prenoms == null) {
               if (other$prenoms != null) {
                  return false;
               }
            } else if (!this$prenoms.equals(other$prenoms)) {
               return false;
            }

            label62: {
               Object this$contact = this.getContact();
               Object other$contact = other.getContact();
               if (this$contact == null) {
                  if (other$contact == null) {
                     break label62;
                  }
               } else if (this$contact.equals(other$contact)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$username = this.getUsername();
               Object other$username = other.getUsername();
               if (this$username == null) {
                  if (other$username == null) {
                     break label55;
                  }
               } else if (this$username.equals(other$username)) {
                  break label55;
               }

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

   protected boolean canEqual(final Object other) {
      return other instanceof Client;
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
      Object $contact = this.getContact();
      result = result * 59 + ($contact == null ? 43 : $contact.hashCode());
      Object $username = this.getUsername();
      result = result * 59 + ($username == null ? 43 : $username.hashCode());
      Object $password = this.getPassword();
      result = result * 59 + ($password == null ? 43 : $password.hashCode());
      return result;
   }

   public Client() {
   }

   public Client(final Long id, final String nom, final String prenoms, final String contact, final String username, final String password) {
      this.id = id;
      this.nom = nom;
      this.prenoms = prenoms;
      this.contact = contact;
      this.username = username;
      this.password = password;
   }

   public String toString() {
      return "Client(id=" + this.getId() + ", nom=" + this.getNom() + ", prenoms=" + this.getPrenoms() + ", contact=" + this.getContact() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ")";
   }
}
