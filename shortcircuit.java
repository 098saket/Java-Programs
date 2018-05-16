class shortcircuit
{
public static void main(String a[])
{
   int x=10,y=5;
   if(x==11 || ++y==7)
   {
   System.out.println("Hello");
   }
   else
   {
   System.out.println("hiii");
   }
   System.out.println(y);
}
}
