public class TestFinallyBlock2{
 public static void main(String args[]){
 try{
 int data = 25/0;
 System.out.println(data);
 }
 catch(ArithmeticException e){System.out.println("Code Executed");}
 finally{System.out.println("finally block is always executed");}
 System.out.println("Rest of the code..");
}
}
