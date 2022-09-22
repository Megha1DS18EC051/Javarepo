class Holiday {


    private String name;
    private int day;
    private String month;
    public Holiday(String name, int day, String month){

        this.name = name;
        this.day = day;
        this.month = month;
    }
    //
//public boolean inSameMonth(Holiday hol){
//    return this.month.equals(hol.month);
    //using get set using alt insert
    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }
}

public class Holidays{
    static boolean inSameMonth(Holiday H1, Holiday H2) {
        if(H1.getMonth().equals(H2.getMonth()))
            return true;
        else
            return false;
    }

    //
    public static double avgDate(Holiday[] H) {
        int sum = 0;
        for (Holiday h : H) {
            sum = sum + h.getDay();
        }
        return ((double) sum) / H.length;
    }

    public static void main(String[] args){
        Holiday H1 = new Holiday("Independence day", 4, "July");
        Holiday H2 = new Holiday("Christmas", 25, "December");
        Holiday[] H = new Holiday[2];
        H[0] = H1;
        H[1] = H2;
        System.out.println(inSameMonth(H1,H2));
        System.out.println(avgDate(H));
    }

}