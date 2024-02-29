import java.util.Scanner;
public class wtwoarray {
    public static void main(String[] args) {
        int a[][]=new int[3][4];
        a[][]={{1,2,3,4},{3,5,6,7},{4,5,6,4}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.println((a[i][j]));
            }
        }      
    }
    
}
