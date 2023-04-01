package com.riad.app.Service.client;

import java.util.List;

import com.riad.app.entities.client.Groupe;


public interface GroupeService {
	Groupe ajouterGroupe(String nomGroupe);
	Groupe modifierGroupe(Long id,String nomGroupe);
	void supprimerGroupe(Long id);
	List<Groupe> chercherGroupe(String mc);
	Groupe ajouterClientGroupe(Long numClient,Long idGroupe);
	Groupe supprimerClientGroupe(Long numClient,Long idGroupe);
	
	

}
