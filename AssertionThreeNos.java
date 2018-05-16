import java.util.Scanner;
class AssertionThreeNos
{
 public static void main(String args[])
 {
 System.out.println("Enter three integers ");
 Scanner in = new Scanner(System.in);
 int x,y,z;
 x = in.nextInt();
 y = in.nextInt();
 z = in.nextInt();
 assert x>y || x>y:"x is greater";
 assert y>x || y>z:"y is greater";
 assert z>x || z>y:"z is greater";
 }
}
