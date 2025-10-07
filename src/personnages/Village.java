package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, Gaulois chef, int nbmax) {
		this.nom = nom;
		this.chef = chef;
		chef.setVillage(this);
		villageois = new Gaulois[nbmax];
	}

	public Gaulois getChef() {
		return chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterVillageois(Gaulois gaulois) {

	}

	public void trouverVillageois(int numVillageois) {

	}

	public void afficherVillage() {

	}

}
