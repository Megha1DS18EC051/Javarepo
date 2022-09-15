import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
public class Pattern {
    public static void main(String[] args) {
        int n;

        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        String arr[][]=new String[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=s.next();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }

}
