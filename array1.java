class array1
{
    public static void main(String args[])
    {
    int a[] = new int[2];
    a[0] = 10;
    a[1] = 20;
    int a1[] = new int[2];

    a1 = a;
    a1[0] = 30;
    System.out.println(a[0] + "" + a1[0]);
    System.out.println(a.length + "" + a.length);
    }
}
