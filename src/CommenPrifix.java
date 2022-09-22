/*If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""*/
import java.util.*;
import java.lang.*;

public class CommenPrifix {
    static String prefix(String[] a) {
        StringBuffer CommenPrifix=new StringBuffer();

        if (a.length == 0 || a == null)
            return CommenPrifix.toString();
        int minimum = a[0].length();
        for (String min : a) {
            minimum= Math.min(minimum, min.length());
        }
        for (int i = 0; i <minimum; i++) {
            char current=a[0].charAt(i);
            for(String st:a)
            {
                if(st.charAt(i)!=current)
                    return CommenPrifix.toString();
            }

            CommenPrifix.append(current);
        }
        return CommenPrifix.toString();


    }


public static void main(String[] args) {
        String arr[]=new String[]{"flower","flow","flight"};
        System.out.println( prefix(arr));
    String arr1[]=new String[]{"cardog","carrace","car"};
    System.out.println( prefix(arr1));




    }
}
