package com.riad.app.repositories.stock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.riad.app.entities.stock.Produit;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, String> {
	public List<Produit> findByCodeContains(String mc);
	public List<Produit> findByNomProduitContains(String mc);
	
}
