import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> de= new ArrayDeque<Integer>(10);
        de.add(348);
        de.add(43);
        de.remove(1);
        System.out.println(de);
        de.clear();
        System.out.println(de);
        de.addFirst(3);
        de.addFirst(5);
        de.addLast(7);
        de.addLast(6);
        System.out.println(de);


    }
    
}
