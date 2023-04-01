package com.riad.app.Service.stock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riad.app.entities.stock.FamilleProduit;
import com.riad.app.entities.stock.Produit;
import com.riad.app.repositories.stock.ProduitRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class ProduitServiceImpl implements ProduitService{
	@Autowired
	private ProduitRepository pr;
	@Override
	public List<Produit> findAllProds() {
		 return pr.findAll();
	}
	@Override
	public Produit ajouterProduit(String code, String nom, double prix, FamilleProduit fp) {
		Produit produit=Produit.builder()
				.code(code)
				.nomProduit(nom)
				.prix(prix)
				.famille(fp)
				.build();
		return pr.save(produit);
		
	}
	@Override
	public void supprimerProduit(String code) {
		pr.deleteById(code);
	}
	@Override
	public void modifierProduit(String code, String nom, double prix, FamilleProduit fp) {
		Produit produit=pr.findById(code).get();
		produit.setNomProduit(nom);
		produit.setPrix(prix);
		produit.setFamille(fp);
		pr.save(produit);
	}
	@Override
	public List<Produit> chercherProduit(String mc) {
		List<Produit> prods=new ArrayList<Produit>();
		prods.addAll(pr.findByCodeContains(mc));
		prods.addAll(pr.findByNomProduitContains(mc));
		return prods;
	}

}
