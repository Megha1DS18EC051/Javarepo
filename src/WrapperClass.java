class Integer1{
    public int number;

    public Integer1(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }
}


public class WrapperClass {
    public static void main(String[] args) {
        Integer1 i=new Integer1(88);
        System.out.println(i.getNumber());

    }
}
