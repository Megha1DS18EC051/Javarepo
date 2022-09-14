import java.util.*;
import java.lang.*;

public class Greatest {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b) {
            if (a > c)
                System.out.println("the greatest number is "+a);

            else

                System.out.println("the greatest number is "+c);


        }
        else {
            if(b>c)
                System.out.println("the greatest number is "+b);
            else System.out.println("the greatest number is "+c);
        }

    }
}
