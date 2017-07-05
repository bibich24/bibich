
public class SurchargeTest {

	public static void main(String[] args) {
//	Forme[] tab = new Forme[3];
//	
//	Forme forme1 = new Cercle();
//	Forme forme2 = new Triangle();
//	Forme forme3 = new Carre();
//	
//	tab[0] = forme1;
//	tab[1] = forme2;
//	tab[2] = forme3;
//	
//	for(Forme f : tab){
//		System.out.println(f.aire());
//	}

//		 CompteBancaire cb  = new CompteBancaire("gaelle",3000);
//		System.out.println(String.valueOf(cb));
//		
//		Cercle c = new Cercle();
//		c.aire();
//		Triangle t = new Triangle();
//		
//		System.out.println(t.aire());
//		System.out.println(c.aire());
		
		Forme[] f = new Forme[3];
		f[0] = new Carre("gaelle", 10);
		f[1] = new Triangle();
		f[2] = new Cercle("moi");
		
		for (Forme forme : f) {
			System.out.println(forme.aire());
		}
	}
	

}
