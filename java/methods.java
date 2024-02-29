import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class methods
{
    static void prime(int n)
    {
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag++;
            }
            
        }
        if(flag>1)
        {
           System.out.println("not prime");
        }
        else{
            System.out.println("prime");

        }
    }
    static void change(int A[],int position,int value)
    {
        A[position]=value;
    }
    static int max(int x,int y)
    {
        return(x>y)?x:y;
    }
    static int max(int x,int y,int z)
    {
        return((x>y&x>z)?x:(x>y)?x:y);
    }
     static float max(float x,float y)
    {
        return(x>y)?x:y;
    }
    public static void main(String[] args)
    {
        int a=11;
        int b=24;
        int e=10;
        float c=3;
        float d=5;
        int A[]={1,2,3,4};
        System.out.println(max(a,b));
        change(A,2,10);
        System.out.println(A[2]);
        prime(a);
        System.out.println(max(c,d));
        System.out.println(max(a,b,e));
        
    }
    
}

