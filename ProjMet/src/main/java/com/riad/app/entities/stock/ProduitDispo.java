package com.riad.app.entities.stock;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
@Builder
public class ProduitDispo {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Produit produit;
	@ManyToOne
	private Depot depot;
	@PositiveOrZero
	private int quant;
}
