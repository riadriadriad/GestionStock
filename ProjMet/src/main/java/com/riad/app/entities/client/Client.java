package com.riad.app.entities.client;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Client {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numClient;
	@Column(length=191)@NotBlank(message="le nom du client est obligatoire")
	private String nomClient;
	private TypeClient typeClient;
	@ManyToOne
	private Ville villeClient;
	@Column(length=191)@Email(message="email invalid")
	private String email;
	@Column(length=191) @NotBlank(message="le telephone est obligatoire")
	private String telephone;
	@Column(length=191)
	private String adresse1;
	@Column(length=191)
	private String adresse2;
	@ManyToOne
	private Groupe groupeClient;
	@ManyToOne
	private Portefeuille pf;
	
	

}
