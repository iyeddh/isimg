package LesComptes;

public class Compte {
	private int numero;
	private double solde;
	public static int acc_nbr=0;
	private static int  MAX_compte=100;
	public Compte() {
		System.out.println("le compte est cree sans initialistion des parametre");
		acc_nbr++;
	}
	public Compte(double solde, int numero) {
		this.solde=solde;
		this.numero=numero;
		acc_nbr++;
	}
	public void depot (double valeur) {
		this.solde=this.solde+valeur;
	}
	public void retrait(double valeur) {
		this.solde=this.solde-valeur;
	}
	public double getSolde() {
		return this.solde;
	}
	public void afficher() {
		System.out.println("ton solde est : "+this.solde);
	}
	public void setSolde(double solde) {
		this.solde=solde;
	}
	public String toString() {
		return "le porteur du compte numero :   "+this.numero+"   as un solde égale à   :"+this.solde;
	}
	public void virer(double montant_déplacer, Compte destinataire  ) {
		this.solde=this.solde-montant_déplacer;
		destinataire.depot(montant_déplacer);
	}
	public int getNumero() {
		return this.numero;
	}
	
}
