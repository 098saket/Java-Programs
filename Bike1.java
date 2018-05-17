abstract class Bike1
{
   abstract void run();
}
class Honda3 extends Bike1
{
   void run()
    {
      System.out.println("Running Safely..");
    }
    public static void main(String args[])
    {
      Bike obj = new Honda3();
      obj.run();
    }
}
