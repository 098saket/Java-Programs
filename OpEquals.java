// Demonstrate several assignment operators
class OpEquals
{
          public static void main(String args[])
          {
          int a = 1;
          int b = 2;
          int c = 3;
          c += a*b;
          a +=5;
          b *=4;
          c %= 6;
          System.out.println("a =" +a);
          System.out.println("b =" +b);
          System.out.println("c =" +c);
          }
}
