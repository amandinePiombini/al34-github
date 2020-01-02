package fr.afcepf.al34.serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import fr.afcepf.al34.itf.ICalculTva;

public class CalculTvaImpl extends UnicastRemoteObject implements ICalculTva {

	protected CalculTvaImpl() throws RemoteException {
		super(); //appel indispensable du constructeur de UnicastRemoteObject
		//pour que l'objet soit accessible � distance via RMI
	}

	public double tva(double ht, double tauxTva) throws RemoteException {
		return ht * tauxTva/100;
	}

	public double ttc(double ht, double tauxTva) throws RemoteException {
		return ht * (1 + tauxTva/100);
	}

	public String getAuteur() throws RemoteException {
		return "didier / formateur fou";
	}

}
