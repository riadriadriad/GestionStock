package com.riad.app.entities.commerciaux;

import java.sql.Date;
import java.util.List;

import com.riad.app.entities.client.Portefeuille;
import com.riad.app.entities.stock.Depot;
import com.riad.app.entities.stock.ProduitDispo;
import com.riad.app.entities.stock.Region;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity @NoArgsConstructor @AllArgsConstructor @Data
@Builder
public class Commercial {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCommercial ;
	@Column(length=191) @NotBlank
	private String nomCommercial;
	private String prenomCommercial;
	private String username;
	private String password;
	private String cinCommercial;
	private String telephone;
	private String email;
	private Date dateNissance;
	private Portefeuille pf;
	

}
