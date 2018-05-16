import java.util.Scanner;
class Greatest{
     public static void main(String args[])
     {
           System.out.println("Enter three integers ");
           Scanner in = new Scanner(System.in);
           int x,y,z;
           x = in.nextInt();
           y = in.nextInt();
           z = in.nextInt();

         if(x>y && x>z)
         {
           System.out.println("First number is Greater");
         }
         else if(y>x && y>z)
         {
           System.out.println("Second number is Greater");
         }
         else if(z>x && z>y)
         {
           System.out.println("Third number is Greater");
         }
         else
         {
           System.out.println("Invalid");
         }
     }
}
