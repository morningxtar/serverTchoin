package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Prestataire;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface PrestataireRopository extends JpaRepository<Prestataire, Long> {
   @RestResource(
      path = "/byUsernameAndPassword"
   )
   Prestataire findPrestataireByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

   @RestResource(
      path = "/byNomOrPrenoms"
   )
   List<Prestataire> findPrestatairesByNomContainsOrPrenomsContains(@Param("nom") String nom, @Param("prenoms") String prenoms);
}
