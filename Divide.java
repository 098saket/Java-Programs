import java.util.Scanner;
import java.util.*;
class Divide{
 public static void main(String args[]){
   try
 		{
 			int a,b,c;
 			Scanner d=new Scanner(System.in);

			System.out.print("Enter first number : ");
 			a=d.nextInt();

 			System.out.print("Enter second number : ");
 			b=d.nextInt();

 			c=a/b;
 			System.out.println("Answer"+c);
 		}
 		catch(ArithmeticException e)
 		{
 			System.out.println("Error:"+e.getMessage());
 			System.out.println("Error:"+e);
 		}
}
}
