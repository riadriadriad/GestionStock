package com.riad.app.repositories.client;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.riad.app.entities.client.Groupe;
@RepositoryRestResource
public interface GroupeRepository extends JpaRepository<Groupe, Long>{
List<Groupe> findByNomGroupeContains(String mc);
}
