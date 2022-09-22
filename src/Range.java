import java.util.*;
import java.lang.*;

public class Range {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = s.nextInt();
        int A[] = new int[n];

        System.out.println("enter the elements of an array");
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        int range=MaximumNumber(n,A)-MinimumNumber(n,A);
        System.out.println(range);
    }
        static int MaximumNumber(int n,int A[]){
            int max=A[0];
            for (int i=1;i<n;i++)
            {
                if(A[i]>max)
                    max=A[i];

            }return max;

    }
    static int MinimumNumber(int n,int A[]){
        int min=A[0];
        for (int i=1;i<n;i++)
        {
            if(A[i]<min)
                min=A[i];

        }return min;

    }
}
