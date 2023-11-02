package LesClients;
import LesComptes.Compte;
public class Client {
	private static int nbr_com=2;
	public void setNbr_com(int nbr ) {
		nbr_com=nbr;
	}
	private Compte[] com = new Compte[nbr_com];
	private String name;
	public Client() {
		System.out.println("le client est crier");
	}
	public Client (String nom) {
		this.name=nom;
		
	}
	public void setName(String nom) {
		this.name=nom;
	}
	public void setCom(Compte[] c) {
		for (int i=0;i<nbr_com;i++) {
			this.com[i]=c[i];
		}
	}
	public String getNom() {
		return this.name;
	}
	public double[] getSolde() {
		double [] so=new double[nbr_com];
		for (int i=0;i<nbr_com;i++) {
			so[i] =com[i].getSolde();
		}
		return so;
	}
	public void afficheSolde () {
		double s=0;
		for (int i=0;i<nbr_com;i++) {
			System.out.println("le solde dans le compe numero   "+this.com[i].getNumero()+"    est   "+this.com[i].getSolde());
			s=s+this.com[i].getSolde();
		}
		System.out.println("le solde finale de ce client est   :"+s);
		
	}
	public void AjoutCompte(Compte c) {
		this.com[nbr_com+1]=c;
	}
	public int getNbr_com() {
		return nbr_com;
	}
}
