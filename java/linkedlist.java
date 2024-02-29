import java.util.LinkedList;
public class linkedlist {
     public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        
        System.out.println(ll);
        ll.remove(3);
  
        
        System.out.println(ll);
  
        
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");

        
    }
   

    
}
