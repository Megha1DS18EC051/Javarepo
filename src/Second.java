import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        int a, b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("the greater number is "+a);
        }
        else {
            System.out.println("the greater number is "+b);
        }

        //System.out.println((a>b)?a:b); ternary operation


    }
}
//ternary operator

