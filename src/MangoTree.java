import java.util.*;

public class MangoTree {
    public static void main(String[] args) {
        int a, b, c;
        String x = null;
        Scanner s = new Scanner(System.in);
        System.out.println("enter values");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if ((c >= 1 && c <= b) ||(c%b==0)||(c%b==1)){
            System.out.println("Yes");

        }
        else
            System.out.println("No");

    }
}


