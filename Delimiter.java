/*
 * CISC 3150 HW 2 Question 5 
 * Using the scanner delimiter to to tokenize comma seperated values
 * 
 */

/**
 *
 * @author Jaryl
 */
import java.util.*;
public class Delimiter {
    
public static void main (String [] args)
{

        Scanner input = new Scanner (System.in);
        input.useDelimiter (",");//Delimiter set to ","
        
        System.out.println ("Enter words please");
       
        while (input.hasNext())
        {
            System.out.println (input.next());
            
            }
        
}
}




