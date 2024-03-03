package ProdCons;

public class Prod extends Thread{
	static int i=0;
	public void run() {
		//on doit ajouter une semaphore initialiser a n pour attendre jusu'a ce que il y a une place vide
		//if(T.plein)=>attendre :if (V>0) v-- else(attendre)=>else ==T.plein et donc V==nbcasevide
		try {
		Principale.nbCaseVide.acquire();

		Principale.S.acquire();

		append();
		Principale.S.release();
Principale.nbCasePlein.release();
	}catch(Exception e) {}}
	
public void append() {
	int x=(int)(Math.random()*100);
	Principale.tab[i]=x;
	System.out.println("le prod produit"+x);
	i=(i+1)%(Principale.n);
	//si le prod vient et le tab est remplie on doit l'obligee a attendre que le cons consomme une 

}
	

}
