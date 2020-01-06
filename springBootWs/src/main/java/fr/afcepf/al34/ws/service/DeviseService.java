package fr.afcepf.al34.ws.service;

import java.util.List;

import fr.afcepf.al34.ws.entity.Devise;

public interface DeviseService {
	
	Devise rechercherDeviseParCode(String code);
	List<Devise> rechercherDeviseParChangeMini(Double change);
	
	Devise sauvegarderDevise(Devise d);
	void supprimerDevise(String code);
    //...
}
