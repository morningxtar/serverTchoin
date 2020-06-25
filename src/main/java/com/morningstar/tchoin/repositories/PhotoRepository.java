package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Photo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface PhotoRepository extends JpaRepository<Photo, Long> {
   @RestResource(
      path = "/byPrestataire"
   )
   List<Photo> findPhotosByIdPrestataire(@Param("prestataire") Long prestataire);
}
