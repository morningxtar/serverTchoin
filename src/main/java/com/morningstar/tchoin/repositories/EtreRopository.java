package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Etre;
import java.util.List;

import com.morningstar.tchoin.entities.Journee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface EtreRopository extends JpaRepository<Etre, Long> {
   @RestResource(
      path = "/byDisponibilite"
   )
   List<Etre> findEtresByIdDisponibilite(@Param("disponibilite") Long disponibilite);


   List<Etre> findEtresByIdPrestataire(@Param("prestataire_id") Long prestataire_id);





}
