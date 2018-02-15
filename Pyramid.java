/*
 * CISC.3150 HW2 Question 1
 * User inputs a number to print a pyramid
 * 
 */

/**
 *
 * @author Jaryl
 */



import java.util.*;

public class Pyramid {
   
    public static void main (String [] args)
    {
        int height; int width; //Declarations for height and width of the pyramid
        
            Scanner input = new Scanner (System.in);

               System.out.println ("Please enter how tall you will like the pyramid to be:");
        height = Integer.parseInt(input.next());
        width = height+1;  
       
        //http://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/
        //https://stackoverflow.com/questions/48375160/simple-java-pyramid-using-system-out-printf-to-format-output
        for (int i = 1; i<=height;i++)
        {
            width--;
                System.out.printf("%" +width+ "s","");
            
         for (int x = 1; x < i;x++)
            {
                   System.out.print(x);
            }
       
        for (int y = i; y>=1 ; y--)
            {
                   System.out.print(y);
            }
                System.out.println ();
        }
        
       
       
}
}