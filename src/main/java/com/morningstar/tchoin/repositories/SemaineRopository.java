package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Semaine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface SemaineRopository extends JpaRepository<Semaine, Long> {

    Semaine findSemaineById(@Param("id")Long id);
}
