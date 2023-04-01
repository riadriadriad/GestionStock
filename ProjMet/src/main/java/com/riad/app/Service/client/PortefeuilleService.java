package com.riad.app.Service.client;

import com.riad.app.entities.client.Portefeuille;

public interface PortefeuilleService {
	Portefeuille ajouterPF(String pf);
	Portefeuille modifierPF(Long idPf,String pf);
	void supprimerPF(Long idPf);
	Portefeuille ajouterClientPF(Long numClient,Long idPF);
	Portefeuille supprimerClientPF(Long numClient,Long idPF);
	

	

}
