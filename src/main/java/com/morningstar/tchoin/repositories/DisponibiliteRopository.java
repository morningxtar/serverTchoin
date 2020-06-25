package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Disponibilite;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface DisponibiliteRopository extends JpaRepository<Disponibilite, Long> {
   @RestResource(
      path = "/bySemaineOrJournee"
   )
   List<Disponibilite> findDisponibilitesByIdSemaineOrIdJournee(@Param("semaine") Long semaine, @Param("journee") Long journee);

   @RestResource(
      path = "/bySemaineAndJournee"
   )
   List<Disponibilite> findDisponibilitesByIdSemaineAndIdJournee(@Param("semaine") Long semaine, @Param("journee") Long journee);

   @RestResource(
           path = "/byDisponibiliteId"
   )
   Disponibilite findDisponibiliteById(@Param("desponibility_id") Long desponibility_id);
}
