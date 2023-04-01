package com.riad.app.Service.stock;

import com.riad.app.entities.stock.Depot;
import com.riad.app.entities.stock.Produit;
import com.riad.app.entities.stock.ProduitDispo;

import jakarta.validation.constraints.Positive;

public interface ProduitDispoService {
	public ProduitDispo ajouterProduitDispo(Produit produit,Depot depot,int qte);
	public void retirerQteProduit(Produit produit ,Depot depot ,@Positive int qte);
	public void ajouterQteProduit(Produit produit,Depot depot ,@Positive int qte);
	public void supprimerProduitDispo(Long id);
}
