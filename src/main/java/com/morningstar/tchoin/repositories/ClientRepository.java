package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
   @RestResource(
      path = "/byUsernameAndPassword"
   )
   Client findClientByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
