import java.util.ArrayList;
import java.util.Vector;

public class arraysds {
    public static void main(String[] args)
    {
        ArrayList<Integer>al=new ArrayList<Integer>();
        al.add(3);
        al.add(5);
        al.add(1,8);
        System.out.println(al);
        
        for(int i=0;i<al.size();i++)
        System.out.println(al.get(i));
    }
}
