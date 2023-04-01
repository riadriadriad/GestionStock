package com.riad.app.Service.stock;

import java.util.List;

import com.riad.app.entities.stock.FamilleProduit;
import com.riad.app.entities.stock.Produit;


public interface ProduitService {
	public List <Produit> findAllProds();
	public Produit ajouterProduit(String code,String nom,double prix,FamilleProduit fp);
	public void supprimerProduit(String code);
	public void modifierProduit(String code,String nom,double prix,FamilleProduit fp);
	public List<Produit> chercherProduit(String mc);
	
	

}
