/*CISC.3150 HW2 Question 3
 * 
 * Program to detect if a word is a palindrome
 */

/**
 *
 * @author Jaryl
 */

import java.util.*;

public class Palindrome {
    
       public static void main (String [] args)
       {
           
           String str1; String str2;  //Variable Declarations 
       
            Scanner input = new Scanner (System.in);
        
        System.out.println ("Input a word"); //User Input
        str1 = input.nextLine ();
        
       
        str2 = new StringBuilder(str1).reverse().toString(); //stores the reverse word in string to compare
       
        
        if (str1.equals (str2)) // checks to see if the word is palindrome
        
        {
           System.out.println ("Palindrome!");
                        }
        
        else 
        {
            System.out.println ("Not a palindrome");
        }
        
        
}
}