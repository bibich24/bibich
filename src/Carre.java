
public  class Carre implements Forme {
	
	
protected int cote = 4;
protected String nom;
protected String nomFemme;

public double aire(){
	return cote * cote;
	}

 public Carre(String nom,int cote) {
	 this.nom = nom;
	 this.cote = cote;
}
 public Carre(String nom,int cote,String nomFemme) {
	this(nom, cote);
	this.nomFemme = nomFemme;
}
}
