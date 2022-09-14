//switch case

import java.util.*;
public class Four {
    public static void main(String[] args) {
        String day;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter day");
        day=s.nextLine();
        switch(day)
        {
            case "Monday": System.out.println("It is first day of week");
            break;
            case "Tuesday": System.out.println("It is second day of week");
            break;
            case "Wednesday": System.out.println("It is third day of week");
            break;
            case "Thursday": System.out.println("It is fourth day of week");
            break;
            case "Friday": System.out.println("It is fifth day of week");
            break;
            case "Saturday": System.out.println("It is sixth day of week");
            break;
            case "Sunday": System.out.println("It is seventh day of week");
            break;
            default:
                System.out.println("Not available");
                break;
        }

    }
}
