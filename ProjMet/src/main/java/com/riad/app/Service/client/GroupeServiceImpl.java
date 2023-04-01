package com.riad.app.Service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riad.app.entities.client.Client;
import com.riad.app.entities.client.Groupe;
import com.riad.app.repositories.client.ClientRepository;
import com.riad.app.repositories.client.GroupeRepository;
@Service
public class GroupeServiceImpl implements GroupeService {
	@Autowired
	private GroupeRepository gr;
	@Autowired
	private ClientRepository cr;
	@Override
	public Groupe ajouterGroupe(String nomGroupe) {
		Groupe groupe=Groupe.builder().nomGroupe(nomGroupe)
				.build();
		return gr.save(groupe);
	}

	@Override
	public Groupe modifierGroupe(Long id,String nomGroupe) {
		Groupe groupe=gr.findById(id).get();
		
		return gr.save(groupe);
	}

	@Override
	public void supprimerGroupe(Long id) {
		gr.deleteById(id);
	}

	@Override
	public List<Groupe> chercherGroupe(String mc) {
		return gr.findByNomGroupeContains(mc);
	}

	@Override
	public Groupe ajouterClientGroupe(Long numClient, Long idGroupe) {
		Groupe groupe=gr.findById(idGroupe).get();
		Client client = cr.findById(numClient).get();
		groupe.getClients().add(client);
		return gr.save(groupe);
	}

	@Override
	public Groupe supprimerClientGroupe(Long numClient, Long idGroupe) {
		Groupe groupe=gr.findById(idGroupe).get();
		Client client = cr.findById(numClient).get();
		groupe.getClients().remove(client);
		return gr.save(groupe);
	}

}
