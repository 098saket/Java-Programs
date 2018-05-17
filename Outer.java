class TestInner
{
public static void main(String args[])
{
//Outerclass.InnerClass   innerObject = Outerobject.new InnerClass();
//Outerclass.StaticNestedclass   nestedObject = new
                  Outerclass.StaticNestedClass();
 Outer o=new Outer();
 Outer.Inner a=o.new Inner();
 a.display();
 //a.show();
 }
 }
