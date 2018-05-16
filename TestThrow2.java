import java.io.IOException;
class TestThrow2{
  void m()throws IOException{
    throw new IOException("device error");//checked exception
  }
  void n()throws IOException{
    m();
  }
  void p(){
    try{
      n();
    }catch(Throwable e){System.out.println("exception handled");}
  }
public static void main(String args[]){
  TestThrow2 obj = new TestThrow2();
  obj.p();
  System.out.println("normal flow...");
}
}
