import java.util.*;
import java.lang.*;
class BrowseHistory{
    ArrayList<String> History=new ArrayList<>();
    int currentIndex=-1;
    public  void  BrowseHistory1(){
        System.out.println("You're in homepage - null");

    }
    public void visit(String URL){
        History.add(currentIndex+1,URL);
        currentIndex++;
        if(currentIndex!=(History.size()-1)){
            History.subList(currentIndex+1,History.size()).clear();
            System.out.println(History);
        }
        System.out.println("you're moved to" +URL+"null");
    }
    public  void back(int steps){
        if(steps>currentIndex)
            steps=currentIndex;
        currentIndex-=steps;
        System.out.println("you've moved to"+History.get(currentIndex));
    }
    public  void forward(int steps){
        if(steps>History.size()-currentIndex-1)
            steps=History.size()-currentIndex-1;
        currentIndex+=steps;
        System.out.println("you've moved to"+History.get(currentIndex));
    }
}


public class BrowseHistoryClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BrowseHistory newTab=new BrowseHistory();
        String command;
        String URL;
        int steps;
        while(sc.hasNext()){
            command=sc.next();
            if(command.contains("BrowseHistory")){
                newTab.BrowseHistory1();
            }
            else if (command.contains("visit"))
            {
                System.out.print("Enter URL: ");
                URL=sc.next();
                newTab.visit(URL);

            }
            else if (command.contains("back"))
            {
                System.out.print("Enter steps: ");
                steps=sc.nextInt();
                newTab.back(steps);

            }
            else if (command.contains("forward"))
            {
                System.out.print("Enter steps: ");
                steps=sc.nextInt();
                newTab.forward(steps);

            }
            else if (command.contains("exit"))
            {
                System.out.println("Thank u for visiting our website");
                break;

            }
            else
                System.out.println("enter a valid command");

        }
    }
}
