package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Accessoire;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface AccessoireRopository extends JpaRepository<Accessoire, Long> {
   @RestResource(
      path = "/byAccessoire"
   )
   List<Accessoire> findAccessoiresByLibelleContains(@Param("accessoire") String accessoire);
}
