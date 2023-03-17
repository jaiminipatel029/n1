package inheritance;

public class MainTest
{
    public static void main(String[] args)
    {
        System.out.println("Parent class Teacher");

        Laptop l = new Laptop();
        l.companyname();
        l.price();
        l.version();
        l.range();
        l.color();
        l.size();


        System.out.println("Child class is L1");
        L1  k = new L1();
        k.companyname();
        k.price();
        k.version();
        l.range();


        System.out.println("Child class is L2");
        L2 j = new L2();
        j.companyname();
        j.price();
        j.version();
        j.color();



        System.out.println("Child class is L3");
        L3 h = new L3();
        h.companyname();
        h.price();
        h.version();
        h.size();

        System.out.println("child class is D1");
        D1 m = new D1();
        m.range();
        m.color();
        m.size();







    }
}
