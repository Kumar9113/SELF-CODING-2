abstract class kumar
{
    public void meth()
    {
        System.out.println("super constuctor");
    }
    public  void meth1()
    {
        System.out.println("meth1 of super");
    }
    abstract public void meth2();
}
class ku extends kumar{
     public void meth2()
    {
        System.out.println("sub meth2"); 
    }
}
public class abstact {
    public static void main(String[] args)
    {
       kumar s=new ku() ;
       s.meth();
       s.meth1();
       s.meth2();
    }
}