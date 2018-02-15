/*
 * CISC.3150 HW2 Question 2
 * A program that displays a calendar on the screen. When the user inputs
    the year and what day the first of January fell on
 * 
 */

/**
 *
 * @author Jaryl
 */
import java.util.*;


public class Calendar 
{
    public static void main (String [] args)
  {

        Scanner input = new Scanner(System.in);
        String fDay; //Input day month starts on

        System.out.print("Please Enter a year: ");
        int year = input.nextInt();

       System.out.println("What Day was/is the 1st of Janaury [Su, Mo, Tu, We, Th, Fr, Sa]");
        fDay = input.next();
        
        int wDay;//To convert int (first day) to string in switch statement

        
        String[] week; //String Array for days of the week
        week = new String[]{
            "Su",
            "Mo",
            "Tu",
            "We",
            "Th",
            "Fr",
            "Sa"
        };
      //Switch statement for user inputted first day of the year
        switch (fDay){
            case "Su":
                wDay= 0;
                break;
            case "Mo":
                wDay= 1;
                break;
            case "Tu":
                 wDay = 2;
                break;
            case "We":
                wDay= 3;
                break;
            case "Th":
                 wDay= 4;
                break;
            case "Fr":
                wDay= 5;
                break;
            case "Sa":
                 wDay= 6;
                break;
            default:
                 wDay= 0;
                break;
        }
        
        int spacing = 4; //to help center the month using printf method
        
        //https://stackoverflow.com/questions/2709993/how-to-center-string-output-using-printf-and-variable-width-java
        int numDays= 0;
        for (int month = 1; month <= 12; month++) //Displays the month name and year
        {    
            switch (month)
            {
                
                case 1:
                    System.out.printf("         %" + spacing + "s", "January  "+year);
                        numDays= 31;
                    break;
                case 2:
                    System.out.printf("         %"+spacing+"s","Feburary  "+year);   
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) { //Determines if the year is a leap year
                        numDays= 29;
                    } else {
                        numDays= 28;
                    }
                    break;
                case 3:
                    System.out.printf("         %" + spacing + "s", "March  "+year);
                   
                        numDays= 31;
                    break;
                case 4:
                    
                     System.out.printf("         %" + spacing + "s", "April  "+year);
                    
                        numDays= 30;
                    break;
                case 5:
                    System.out.printf("         %" + spacing + "s", "May  "+year);
                   
                        numDays= 31;
                    break;
                case 6:
                     System.out.printf("         %" + spacing + "s", "June  "+year);
                    
                        numDays= 30;
                    break;
                case 7:
                     System.out.printf("         %" + spacing + "s", "July  "+year);
                  
                        numDays= 31;
                    break;
                case 8:
                     System.out.printf("         %" + spacing + "s", "August  "+year);
                   
                        numDays= 31;
                    break;
                case 9:
                     System.out.printf("         %" + spacing + "s", "September  "+year);
                 
                        numDays= 30;
                    break;
                case 10:
                     System.out.printf("         %" + spacing + "s", "October  "+year);
                   
                        numDays= 31;
                    break;
                case 11:
                     System.out.printf("         %" + spacing + "s", "November  "+year);
                 
                        numDays= 30;
                    break;
                case 12:
                     System.out.printf("         %" + spacing + "s", "December  "+year);
                   
                        numDays= 31;
            }
           
            //Displays the days of the week
            System.out.println("");
            System.out.println(Arrays.toString(week));

          //https://www.leveluplunch.com/java/exercises/display-calendars/
            for (int i = 0; i < wDay; i++) {
                System.out.print("    ");
           }
            for (int i = 1; i <= numDays; i++)
            {
                if (i < 10) {
                    System.out.print("   " + i);
                } else {
                    System.out.print("  " + i);
                }
                if ((i + wDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println("");
            


            wDay = (wDay + numDays) % 7;
 }
  }
}


