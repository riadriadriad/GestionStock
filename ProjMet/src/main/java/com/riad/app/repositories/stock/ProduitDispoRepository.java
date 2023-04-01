package com.riad.app.repositories.stock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.riad.app.entities.stock.Depot;
import com.riad.app.entities.stock.Produit;
import com.riad.app.entities.stock.ProduitDispo;


@RepositoryRestResource
public interface ProduitDispoRepository extends JpaRepository<ProduitDispo,Long>{
	public ProduitDispo findByDepotAndProduit(Depot depot,Produit produit);

}
