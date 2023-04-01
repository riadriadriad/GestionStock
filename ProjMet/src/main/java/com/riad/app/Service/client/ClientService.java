package com.riad.app.Service.client;

import java.util.List;

import org.springframework.stereotype.Service;

import com.riad.app.entities.client.Client;
import com.riad.app.entities.client.TypeClient;


@Service
public interface ClientService {
	
	Client ajouterClient(String nomClient,TypeClient tc,String email,String tel,String adresse1,String adresse2 );
	Client modifierClient(Long id,String nomClient,TypeClient tc,String email,String tel,String adresse1,String adresse2 );
	List<Client> chercherClient(String mc);
	void supprimerClient(Long numClient);
	List<Client> clientsParGroupe(Long idGroupe);
	List<Client> clientsParVille(Long id);
	List<Client> clientsParPortfeuille(Long id);
} 
