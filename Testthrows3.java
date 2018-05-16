import java.io.*;
class M
{
     void method()throws IOException
     {
        System.out.println("Device operation performed");
     }
}
class Testthrows3
{
  public static void main(String args[])throws IOException
  {  //declare Exception
       M m = new M();
       m.method();
       System.out.println("normal flow");
    }
}
