package com.riad.app.Service.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riad.app.entities.stock.FamilleProduit;
import com.riad.app.repositories.stock.FPRep;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class FPServImpl implements FPService {
	@Autowired
	private FPRep fprep;
	@Override
	public FamilleProduit ajouterFP(String lib) {
		FamilleProduit familleProduit=FamilleProduit.builder()
				.libille(lib).build();
		fprep.save(familleProduit);
		
		return familleProduit;
	}
	public void supprimerFP(FamilleProduit familleProduit) {
		fprep.delete(familleProduit);
		
	}
	@Override
	public List<FamilleProduit> allFams() {
		
		return fprep.findAll();
	}
	@Override
	public FamilleProduit modifierFamille(Long id, String lib) {
		FamilleProduit fp=fprep.findById(id).get();
		fp.setLibille(lib);
		return fprep.save(fp);
	}
	@Override
	public List<FamilleProduit> chercherFamilleProduit(String mc) {
		return fprep.findByLibilleContains(mc);
		
	}
	

	

}
