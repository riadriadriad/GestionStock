package com.riad.app.repositories.client;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.riad.app.entities.client.Client;
import com.riad.app.entities.client.Groupe;
import com.riad.app.entities.client.Portefeuille;
import com.riad.app.entities.client.Ville;
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
List<Client> findByNomClientContains(String mc);
List<Client> findByNumClientContains(Long numClient);
List<Client> findByVilleClient(Ville villeClient);
List<Client> findByPf(Portefeuille pf);
List<Client> findByGroupeClient(Groupe groupeClient);
}
