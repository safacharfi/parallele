package ProdCons;

import java.util.concurrent.Semaphore;

public class Principale {
	static int n=10;
	static int[] tab = new int[n];
	static Semaphore S=new Semaphore(1,true);
	static Semaphore nbCaseVide=new Semaphore(n,true);
	static Semaphore nbCasePlein=new Semaphore(0,true);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons cons1=new Cons();
		Prod prod1=new Prod();
		Cons cons2=new Cons();
		Prod prod2=new Prod();
		Cons cons3=new Cons();
		Prod prod3=new Prod();
		cons1.start();
		prod1.start();
		cons2.start();
		prod2.start();
		cons3.start();
		prod3.start();
		
		try {
			cons1.join();
			prod1.join();
			cons2.join();
			prod2.join();
			cons3.join();
			prod3.join();
		}
		catch(Exception e) {}
		

	}

}
