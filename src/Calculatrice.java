
public class Calculatrice {
	
	private double resultat =0;
	
	public void additionner(double...nbres){
		for(double nbre : nbres){
		resultat += nbre;
		}
		
	}

	public double getResultat() {
		return resultat;
	}

	public void setResultat(double resultat) {
		this.resultat = resultat;
	}
	

}
