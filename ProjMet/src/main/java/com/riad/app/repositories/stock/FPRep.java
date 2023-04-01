package com.riad.app.repositories.stock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.riad.app.entities.stock.FamilleProduit;

@RepositoryRestResource
@CrossOrigin("*")
public interface FPRep extends JpaRepository<FamilleProduit, Long> {
public List<FamilleProduit> findByLibilleContains(String kw);
}
