import java.util.*;
import java.lang.*;

public class Array {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = s.nextInt();
        int arr1[] = new int[n];
        System.out.println("enter the values of array");
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        int result = checkarray(n, arr1);
        if(result==1)
            System.out.println("even");
        else if(result==2)
            System.out.println("odd");
        else
            System.out.println("mixed");

    }
    public static int checkarray (int n, int arr1[])
    {
        int odd=0,even=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        if(even== arr1.length)
            return 1;
        else if (odd==arr1.length)
            return 2;
        else
            return 3;

    }
}
