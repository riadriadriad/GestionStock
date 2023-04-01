package com.riad.app.repositories.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.riad.app.entities.client.Ville;
@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville, Long>{

}
