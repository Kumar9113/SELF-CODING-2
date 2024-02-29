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
class cylinder extends circle
{
    public double hight;
    public double volume(double h)
        {
           return area()*h;
        }
} 
public class inheritance {

    public static void main(String[] args)
    {
        circle first=new circle();
        first.setradius(7);
        System.out.println(first.area());
        System.out.println( first.parameter());
        cylinder c1= new cylinder();
        c1.setradius(6);
        
        System.out.println(c1.volume(4));
       

        
    }
    
}
