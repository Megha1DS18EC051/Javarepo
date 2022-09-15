import java.util.*;
import java.lang.*;
public class MagicSquare {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no of rows/columns");
        n = s.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("enter the elements of an matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
       boolean result = First(arr, n);
        if(result==true)
            System.out.println("yes magical square");
        else
            System.out.println("not a magical square");

    }

    static boolean First(int arr[][], int n) {
        int mat1=0,mat2=0;
        for (int i=0;i<n;i++)
        {

            mat1+=arr[i][i];
            mat2+=arr[i][n-1-i];


        }if (mat1!=mat2)
            return false;



        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 = sum1 + arr[i][j];
                sum2 = sum2 + arr[j][i];
            }
            if (sum1 != sum2 || sum2 != sum1)
                return false;
        }return true;
    }

}
