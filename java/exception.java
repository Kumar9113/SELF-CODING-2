
class test
{
    int a,b,c;
    public void divisions()
    
    {
        try{
            c=a/b;
            System.out.print(c);
           
        }
        catch(Exception c)
        {
            System.out.println(c.getMessage());
            c.printStackTrace();

        }
        System.out.print("bye bye");
       
    }
    
}

public class exception {
    public static void main(String[] args) {
        test s1=new test();
        s1.a=5;
        s1.b=0;
        s1.divisions();
        
    }

    
}
