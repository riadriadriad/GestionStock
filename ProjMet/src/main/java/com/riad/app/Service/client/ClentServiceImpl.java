package com.riad.app.Service.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riad.app.entities.client.Client;
import com.riad.app.entities.client.Groupe;
import com.riad.app.entities.client.Portefeuille;
import com.riad.app.entities.client.TypeClient;
import com.riad.app.entities.client.Ville;
import com.riad.app.repositories.client.ClientRepository;
import com.riad.app.repositories.client.GroupeRepository;
import com.riad.app.repositories.client.PortefeuilleRepository;
import com.riad.app.repositories.client.VilleRepository;
@Service
public class ClentServiceImpl implements ClientService{
	@Autowired
	private ClientRepository cr;
	@Autowired
	private VilleRepository vr;
	@Autowired 
	private PortefeuilleRepository pfr; 
	@Autowired
	private GroupeRepository gr;

	@Override
	public Client ajouterClient(String nomClient, TypeClient tc, String email, String tel, String adresse1,
			String adresse2) {
		Client client=Client.builder()
				.nomClient(nomClient)
				.typeClient(tc)
				.email(email)
				.telephone(tel)
				.adresse1(adresse1)
				.adresse2(adresse2)
				.build();
		
		return cr.save(client);
	}

	@Override
	public Client modifierClient(Long id,String nomClient, TypeClient tc, String email, String tel, String adresse1,
			String adresse2) {
		Client client=cr.findById(id).get();
		client.setNomClient(nomClient);
		client.setTypeClient(tc);
		client.setEmail(email);
		client.setTelephone(tel);
		client.setAdresse1(adresse1);
		client.setAdresse2(adresse2);
		return cr.save(client);
	}

	@Override
	public List<Client> chercherClient(String mc) 
	{	List<Client> clients=new ArrayList<Client>();
		clients.addAll(cr.findByNomClientContains(mc));
		Long nc=Long.valueOf(mc);
		clients.addAll(cr.findByNumClientContains(nc));
		
		return clients;
	}

	@Override
	public void supprimerClient(Long numClient) {
		 cr.deleteById(numClient);
	}

	@Override
	public List<Client> clientsParGroupe(Long idGroupe) {
		Groupe groupe=gr.findById(idGroupe).get();
		List<Client> clients=cr.findByGroupeClient(groupe);
		return clients;
	}

	@Override
	public List<Client> clientsParVille(Long id) {
		Ville ville=vr.findById(id).get();
		List<Client> clients=cr.findByVilleClient(ville);
		return clients;
	}

	@Override
	public List<Client> clientsParPortfeuille(Long id) {
		Portefeuille pf=pfr.findById(id).get();
		List<Client> clients =cr.findByPf(pf);
		return clients;
	}

}
