import java.lang.String;
import pack1.demo;
public class statics {
    static
    {
        System.out.println("1");
    }
    
    static
    {
        System.out.println("2");
    }
    public static void main(String[] args)
    {
        String str=new String();
        str="hello";
        System.out.println(str);

    }
}
