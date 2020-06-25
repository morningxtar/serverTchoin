package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Commande;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface CommandeRopository extends JpaRepository<Commande, Long> {
   @RestResource(
      path = "/byStatus"
   )
   List<Commande> findCommandesByStatus(@Param("status") String status);
}
