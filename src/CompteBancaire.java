
public class CompteBancaire {
private String numero;
private String nom;
private int solde = 0;

public CompteBancaire(String nom,int solde){
	this.nom = nom;
	this.solde = solde;
	
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

@Override
	public String toString() {
		return  String.format("compte bancaire de %s avec %d de solde",nom,solde);
	}

}
