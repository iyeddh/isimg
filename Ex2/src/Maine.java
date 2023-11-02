import LesComptes.Compte;
import LesClients.Client;
public class Maine {

	public static void main(String[] args) {
		Compte c1,c2,c3;
		c1= new Compte (3500.0,2);
		c2= new Compte (350.20,21);
		c3= new Compte (300.0,23);
		Compte[] com1=new Compte [2];
		com1[0]=c1;
		com1[1]=c3;
		Compte[] com2= new Compte[1];
		com2[0]=c2;
		Client cl1;
		cl1=new Client("iyed");
		cl1.setNbr_com(com1.length);
		cl1.setCom(com1);
		Client cl2;
		cl2=new Client("kamel");
		cl2.setNbr_com(com2.length);
		cl2.setCom(com2);
		System.out.println(cl1.getNom());
		cl1.afficheSolde();
		System.out.println(cl2.getNom());
		cl2.afficheSolde();
		Client[] tab =new Client [2];
		Banque b1 =new Banque (tab);
		b1.getName();
	}
}