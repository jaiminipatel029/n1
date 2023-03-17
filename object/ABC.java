package object;

public class ABC
{
    String name;
    int qty;


    public static void main(String[] args)
    {
        ABC obj1 = new ABC();
        obj1.name = "abc";

        obj1.qty = 20;

       System.out.println("The  name is: "+obj1.name);
       System.out.println("The  qty is: "+obj1.qty);

    }
}
