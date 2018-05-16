// Write an application on Population. Assume that the population of Mexico is 114 million and that the population increases 1.01
// percent annually.Assume that the popluation of the United States is 312 million and that the population is reduced .15 percent annually.
// Display the population for the two countries every year until the population of Mexico exceeds that of the United Staes and Display
// the number of year it took;
import java.util.Scanner;

class Population()
{
    public static void main(String args[])
    {
       double Mexico = 114;
       double Mexico_inc = 1.01;
       double US = 312;
       double US_dec = 0.15;

       while (US>Mexico){
     System.out.println("Mexico's population > " + Mexico + "million");
     System.out.println("USA's population > " + US + "million");
     Mexico+=Mexico*Mexico_inc;
     US-=US*US_dec;
   }
    }
}
