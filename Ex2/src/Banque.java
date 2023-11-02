
import LesClients.Client;
public class Banque {
	private static int nbr_client=2;
	public void setNbr_client(int k) {
		nbr_client =k;
	}
	private Client[] cl=new Client[nbr_client];
	public Banque () {
		for(int i=0;i<nbr_client;i++) {
			this.cl[i]=new Client();
		}
	}
	public Banque (Client[] cl) {
		for(int i=0;i<nbr_client;i++) {
			this.cl[i]=cl[i];
		}
	}
	public void getName() {
		System.out.println("les Cient de cette banque sont  :");
		System.out.println(cl[0].getNbr_com());
		for(int i =0; i<nbr_client;i++) {
			for (int j=0;j<cl[i].getNbr_com();j++) {
				System.out.println(this.cl[i].getNom());
			}
		}
	}
}