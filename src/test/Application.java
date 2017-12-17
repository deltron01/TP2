package test;

import metier.Compte;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Compte c1 = new Compte(7000);
		Compte c2 = new Compte(6000);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("Le nombre de comptes : " + Compte.getNbrComptes());
		System.out.println("Le nombre de comptes : " + c2.getNbrComptes());
		System.out.println("Le solde du compte 1 : " + c1.getSolde());
		System.out.println("Le solde du compte 2 : " + c2.getSolde());
		c1.verser(5000);
		c1.retirer(900);
	}

}
