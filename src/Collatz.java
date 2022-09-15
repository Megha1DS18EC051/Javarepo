import java.util.*;
import java.lang.*;

public class Collatz {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n==1) {
            System.out.println(0);

        }
        else {

            while (n > 0) {
                if (n % 2 == 0) {
                    n = n / 2;
                    System.out.println(n);
                } else {

                    n = (3 * n) + 1;
                    System.out.println(n);

                }
                if (n == 1) {
                    System.out.println(n);
                    break;
                }
            }
        }
    }

}

