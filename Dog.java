interface Animal
 {
   public void eat();
   public void walk();
 }

 public class Dog implements Animal
  {
       public void eat()
       {
         System.out.println("Dog eats");
       }
       public void walk()
       {
         System.out.println("Dog walks");
       }
       public int noOfLegs()
       {
         return 4;
       }
    public static void main(String args[])
    {
      Dog d = new Dog();
      d.eat();
      d.walk();
    }
  }
