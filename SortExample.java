import java.util;
public class SortExample
{
pulic static void main(String args[])
{
Set<Integer> tree = new TreeSet<Integer>(new Comparator<Interger>()
{
  public int compare(Integer o1,Integer o2)
  {
    return o2.compareTo(o1);
  }
});
tree.add(3);
tree.add(1);
tree.add(2);
System.out.println("Treeset"+tree); 
}
}
