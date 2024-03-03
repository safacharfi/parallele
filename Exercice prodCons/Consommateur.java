package ProdCons;

public class Cons extends Thread{
	static int i=0;
public void run() {
	//if(T.vide)=>attendre :if(v>0==>v-- else(T.vide) attendre) donc l v==>nbCasePlein
	try {
	Principale.nbCasePlein.acquire();
	Principale.S.acquire();
	take();
	Principale.S.release();
	Principale.nbCaseVide.release();
}
catch(Exception e) {}}
public void take() {
	
	
int	y=Principale.tab[i];
	System.out.println("le cons "+y);
	i=(i+1)%Principale.n;
	//si le cons vient et le tab est vide on doi l'obligee a attendre
}
}
