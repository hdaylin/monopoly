import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		 int dienumber1; 
		 int dienumber2;
	        Random rnd = new Random(); 
	        
	        for (int i=1; i<=30; i++);{
	  
	        
	        dienumber1 = 1 + rnd.nextInt(6);
	        dienumber2 = 1 + rnd.nextInt(6);
	        System.out.println("Your roll was a : " + dienumber1+ " and " + dienumber2);  
	       
	        }
	        
	        
	        if( dienumber1 != dienumber2){
	        
	        	 System.out.println("Move " + (dienumber1 + dienumber2) + " spaces and stop");  
	        	
	        	
	        }else{
	        
		        System.out.println("DOUBLES!");  
	        	System.out.println("Move " + (dienumber1 + dienumber2) + " spaces and roll again getting...");   
	        	dienumber1 = 1 + rnd.nextInt(6);
	 	        dienumber2 = 1 + rnd.nextInt(6); 
	 	        System.out.println("Your roll was a : " + dienumber1+ " and " + dienumber2);  
	 	       
	 	        if(dienumber1 == dienumber2){ 
	 	        	System.out.println("DOUBLES!");  
	 	        	System.out.println("Move " + (dienumber1 + dienumber2) + " spaces and roll again getting...");   
	 	        	dienumber1 = 1 + rnd.nextInt(6);
		 	        dienumber2 = 1 + rnd.nextInt(6); 
		 	        System.out.println("Your roll was a : " + dienumber1+ " and " + dienumber2);  
		 	        	
		 	        if(dienumber1 == dienumber2){  
		 	        		System.out.println("Go to Jail!");
		 	        		 
		 	        	}
	 	        	}
	        	}
	        }
	        
}
