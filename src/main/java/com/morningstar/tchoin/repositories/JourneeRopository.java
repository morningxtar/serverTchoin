package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Journee;
import com.morningstar.tchoin.entities.Semaine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"*"})
@RepositoryRestResource
public interface JourneeRopository extends JpaRepository<Journee, Long> {
    Journee findJourneeById(@Param("id")Long id);
}
