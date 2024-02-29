import java.util.Scanner;
public class array {
    public static void main( String[] arg) {
        
        int A[]=new int[100];
        int d=4;
        

       
        int sum=0;
        int temp=0;
        int b[]={1,2,4,7,4};
        int max=b[0];
        for(int i=0;i<b.length;i++)
        {
             sum=sum+b[i];
             if(b[i]==d)
             {
                 System.out.println("found");
             }
             if(max<b[i])
             {
                 temp=max;
                 max=b[i];
                 max=b[i];
             }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(temp);
        for( int j=0;j<b.length;j++)
        {
            A[j]=b[b.length-1-j];
         }
         for( int j=0;j<b.length;j++)
         System.out.println(A[j]);
         int g=5;
        
        


    }
    
}
