package com.riad.app.repositories.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.riad.app.entities.client.Portefeuille;
@RepositoryRestResource
public interface  PortefeuilleRepository extends JpaRepository<Portefeuille, Long>  {

}
