package com.riad.app.entities.client;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Ville {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(length=191) @NotBlank(message="le nom de la ville est Obligatoire")
	private String nomVille;
	@OneToMany(mappedBy="villeClient")
	private List<Client> clients;
}
