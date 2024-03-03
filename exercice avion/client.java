package ex2;

public class Client extends Thread{
	//on peut pas inastanciee Semaphore ici car la valeur non visible pour les autre
	//madem aandna nafs type client najmo nhoutouha static  sinn fl main sans prb
public void run() {
	try {
	main.S.acquire();
	
	//Sc
	reserver();
	main.S.release();}
	catch(Exception e) {
	
}
	}
public void reserver() {
	//int currentnbplace=main.nbplace;
	if(main.nbplace>0) {
		main.nbplace=main.nbplace-1;
		
	}
	
}
	

}
