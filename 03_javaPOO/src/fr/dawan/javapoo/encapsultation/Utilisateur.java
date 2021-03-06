package fr.dawan.javapoo.encapsultation;

public class Utilisateur {

	//Visibilité : public
	//Variable d'instance : Instance.Variable
	private String nom; 
	private String prenom;  
	private int age;     
	
	//Variable de classe  : Classe.Variable
	private static int nbreUtilisateur;
	
	//Constructeur par defaut (sans paramètre)
	public Utilisateur() {
		nbreUtilisateur++;
	}
	
	//Constructeur avec deux paramètres (nom et prenom)
	public Utilisateur(String nom, String prenom) {

		this();
		this.nom = nom;
		this.prenom = prenom;
		//nbreUtilisateur++;
	}
	
	
	//Constructeur avec trois paramètres 
	public Utilisateur(String nom, String prenom, int age) {
		this(nom, prenom);
		//this.age = age;
		this.setAge(age);
	}
	
	//GETTER
	public int getAge() {
		return this.age;
	}
	
	//SETTER 
	public void setAge(int age) {
		
		if(age < 15) {
			System.out.println("Interdit au moins de 15 ans ");
		} else {
			this.age = age;
		}
	
	}
	
	
	//GETTER
	public static int getNbreUtilisateur() {
		return nbreUtilisateur;
	}
	
}
