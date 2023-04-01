package com.riad.app.entities.client;

import java.util.List;

import com.riad.app.entities.stock.Region;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Portefeuille {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codePortefeuille;
	@Column(length=191) @NotBlank(message="le nom du PF est obligatoire")
	private String pf;
	@OneToMany(mappedBy="pf")
	private List<Client> clients;
	@OneToOne
	private Region region;
}
