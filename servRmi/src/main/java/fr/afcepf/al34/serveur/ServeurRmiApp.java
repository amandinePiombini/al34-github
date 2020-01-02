package fr.afcepf.al34.serveur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRmiApp {

	public static void main(String[] args) {
		
		try {
			//initialiser un seveur de noms logiques RMI (numero de port = 1099)
			//qui fonctionne sur le m�me ordinateur que ce serveur de traitement
			//pas besoin de lancer pr�alablement "RmiRegistry" du jdk/bin
			Registry registry = LocateRegistry.createRegistry(1099);
			
			CalculTvaImpl calculateurTva  = new CalculTvaImpl();
			String nomLogiqueCalculateur= "calculateurTva";
			//Naming.rebind(nomLogiqueCalculateur, calculateurTva);
			registry.rebind(nomLogiqueCalculateur, calculateurTva);
			//une tache de fond est automatiquement g�r�e par RMI pour attendre et traiter
			//les futures requ�tes entrantes.
			System.out.println("serveur RMI d�marr� ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
