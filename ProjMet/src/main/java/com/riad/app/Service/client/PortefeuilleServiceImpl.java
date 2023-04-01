package com.riad.app.Service.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riad.app.entities.client.Client;
import com.riad.app.entities.client.Portefeuille;
import com.riad.app.repositories.client.ClientRepository;
import com.riad.app.repositories.client.PortefeuilleRepository;
@Service
public class PortefeuilleServiceImpl implements PortefeuilleService{
	@Autowired
	private PortefeuilleRepository pfr;
	@Autowired
	private ClientRepository cr;
	@Override
	public Portefeuille ajouterPF(String pf) {
		Portefeuille newpf=Portefeuille.builder()
		.pf(pf).build();
		return pfr.save(newpf);
	}

	@Override
	public Portefeuille modifierPF(Long idPf, String pf) {
		Portefeuille mypf=pfr.findById(idPf).get();
		mypf.setPf(pf);
		return pfr.save(mypf);
	}

	@Override
	public void supprimerPF(Long idPf) {
		pfr.deleteById(idPf);
	}

	@Override
	public Portefeuille ajouterClientPF(Long numClient, Long idPF) {
		Client client=cr.findById(numClient).get();
		Portefeuille pf=pfr.findById(idPF).get();
		pf.getClients().add(client);
		return pfr.save(pf);
	}

	@Override
	public Portefeuille supprimerClientPF(Long numClient, Long idPF) {
		Client client=cr.findById(numClient).get();
		Portefeuille pf=pfr.findById(idPF).get();
		pf.getClients().remove(client);
		return pfr.save(pf);
	}

}
