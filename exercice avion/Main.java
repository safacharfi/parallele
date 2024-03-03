
import java.util.concurrent.Semaphore;

public class main {
	//vp lezeha tkoun static on peut la mettre dan le client khater aandna thread bark
	static int nbplace=1;
static Semaphore S=new Semaphore(1,false);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//on doit repondre a vp?thread?sectioncritique=>code execute par le thread par le vp
		//vp:nbplace
		//thread client
		//Sc reserver()
		Client c1=new Client();
		Client c2=new Client();
		c1.start();
        c2.start();
        try {
        	c1.join();
        	c2.join();

        	
        }
        catch(Exception e) {
        	
        }
        System.out. println(nbplace);

        
		
		
	}

}
