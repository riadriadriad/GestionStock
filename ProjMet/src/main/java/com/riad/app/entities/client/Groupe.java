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
public class Groupe {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idGroupe;
	@Column(length=191)@NotBlank(message="le nom du groupe est obligatoire")
	private String nomGroupe;
	@OneToMany(mappedBy="groupeClient")
	private List<Client> clients;
	
}
