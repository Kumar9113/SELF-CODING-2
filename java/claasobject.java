import java.util.Scanner;


class circle
{
    private double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double parameter()
    {
        return 2*Math.PI*radius;
    }
    public double getradius()
    {
        return radius;
    }
    public void setradius(double r)
    {
        radius=r;

    }
}   

public class claasobject {

    public static void main(String[] args)
    {
        circle first=new circle();
        first.setradius(7);
        System.out.println(first.area());
        System.out.println( first.parameter());
    }
    
}
