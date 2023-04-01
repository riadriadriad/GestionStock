package com.riad.app.entities.stock;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
@Builder
public class Produit {
	@Id 
	@Column(length=191)
	private String code;
	@Column(length=191)
	private String nomProduit;
	private double prix;
	@ManyToOne
	private FamilleProduit famille;
	@OneToMany(mappedBy="produit")
	private List<ProduitDispo> produitDispo;
	
	
}
