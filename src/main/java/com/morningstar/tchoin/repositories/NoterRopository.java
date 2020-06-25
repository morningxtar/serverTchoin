package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Noter;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface NoterRopository extends JpaRepository<Noter, Long> {
   @RestResource(
      path = "/byNote"
   )
   List<Noter> findNotersByNote(@Param("note") String note);

   @RestResource(
      path = "/byNoteGreater"
   )
   List<Noter> findNotersByNoteGreaterThanEqual(@Param("note") String note);

   @RestResource(
      path = "/byNoteLess"
   )
   List<Noter> findNotersByNoteLessThanEqual(@Param("note") String note);

   @RestResource(
      path = "/byBrestataire"
   )
   List<Noter> findNotersByIdPrestataire(@Param("prestataire") Long prestataire);
}
