
import java.util.Scanner;

/*
 * CISC.3150 HW2 Question 6
 * Forcing the Scanner class to tokenize the individual characters
 * 
 */

/**
 *
 * @author Jaryl
 */
import java.util.*;
public class Indivdelimiter {
    

public static void main (String [] args)
{

        Scanner input = new Scanner (System.in);
        input.useDelimiter ("");        //Delimiter set to nothing
        System.out.println ("Enter words please");
       
        while (input.hasNext())
        {
            System.out.println ((input.next()));
            }
        
}

}
