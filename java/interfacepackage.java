interface Test
{
    void meth1();
    void meth2();
    void meth3();

}
class my implements Test
{
    public void meth1()
    {
        System.out.println("kumar");

    }
    public void meth2()
    {
        System.out.println(" iam");
    }
    public void meth3()
    {
        System.out.println(" kavi");
    }

    

}
public class interfacepackage {
    public static void main(String[] args) {
        Test t=new my();
        t.meth1();
        t.meth2();
        t.meth3();
        

        
    }
    
}
