class outer
{
    int x=10;
    class innner{
        int y=20;
        void innerdispaly()
        {
            System.out.println(x+y);
        }
    }
    void outerdispaly()
        {
            innner s=new innner();
            s.innerdispaly();
            int z=s.y;
            System.out.println(x+z);


        }
    
}


public class innerclass {
    public static void main(String[] args) {
        
   
    outer z=new outer();
    z.outerdispaly();
   

    }
    

    
}
