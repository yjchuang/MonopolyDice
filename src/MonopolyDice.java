
import java.util.Random;

public class MonopolyDice {
    public static void main(String[] args)
    {
    	int dieNumber1, dieNumber2;
        Random rnd = new Random();
        boolean isDouble = false;
        int doubleCount = 0;
        
        dieNumber1 = 1 + rnd.nextInt(6);
        dieNumber2 = 1 + rnd.nextInt(6);
        System.out.println("User rolls " + dieNumber1 + " & " + dieNumber2);
        if (dieNumber1 != dieNumber2)
        	System.out.println("Move " + (dieNumber1+dieNumber2) + " spaces and stop");
        
        while (dieNumber1 == dieNumber2) {
        	++doubleCount;
        	System.out.println("DOUBLE!!");
        	if(doubleCount < 3)
        		System.out.println("Move " + (dieNumber1+dieNumber2) + " spaces and try again");
        	else {
        		System.out.println("Go to jail --->");
        		break;
        	}
        	dieNumber1 = 1 + rnd.nextInt(6);
            dieNumber2 = 1 + rnd.nextInt(6);
            System.out.println("User rolls " + dieNumber1 + " & " + dieNumber2);
            if(dieNumber1 != dieNumber2) {
            	System.out.println("Move " + (dieNumber1+dieNumber2) + " spaces and stop");
            	break;
            }
        }
    	  
    }
}











