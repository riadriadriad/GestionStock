package com.riad.app.Service.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riad.app.entities.stock.Depot;
import com.riad.app.entities.stock.Produit;
import com.riad.app.entities.stock.ProduitDispo;
import com.riad.app.repositories.stock.ProduitDispoRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Positive;
@Service
@Transactional
public class ProduitDispoServiceImpl implements ProduitDispoService {
	@Autowired
	private ProduitDispoRepository pdr;
	@Override
	public ProduitDispo ajouterProduitDispo(Produit produit, Depot depot, int qte) {
		ProduitDispo produitDispo=ProduitDispo.builder()
				.produit(produit)
				.depot(depot)
				.quant(qte).build();
		return pdr.save(produitDispo);
	}
	@Transactional
	@Override
	public void retirerQteProduit(Produit produit, Depot depot, @Positive int qte) {
		ProduitDispo pdsp=pdr.findByDepotAndProduit(depot, produit);
		if(qte>=pdsp.getQuant()) pdsp.setQuant(pdsp.getQuant()-qte);
		pdr.save(pdsp);
		
	}

	@Override
	public void ajouterQteProduit(Produit produit, Depot depot, @Positive int qte) {
		ProduitDispo pdsp=pdr.findByDepotAndProduit(depot, produit);
		if(pdsp==null) pdsp=ProduitDispo.builder().depot(depot).produit(produit).quant(qte).build();
		else {
			pdsp.setQuant(pdsp.getQuant()+qte);
			
		}
		pdr.save(pdsp);
	}

	@Override
	public void supprimerProduitDispo(Long id) {
		pdr.deleteById(id);
	}

}
