package com.riad.app.Service.stock;

import java.util.List;

import com.riad.app.entities.stock.Depot;
import com.riad.app.entities.stock.Region;



public interface DepotService {
	public Depot ajouterDepot(Region region,String addresse);
	public void supprimerDepot(Long id);
	public void modifierDepot (Long id,String addresse);
	public List<Depot> allDepots();
	public List<Depot> chercherDepot(String mc);
}
