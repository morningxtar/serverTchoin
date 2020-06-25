package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Accessoire;
import com.morningstar.tchoin.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface StatusRepository extends JpaRepository<Status, Long> {

   List<Status> findAccessoiresByLibelleContains(@Param("status") String status);
}
