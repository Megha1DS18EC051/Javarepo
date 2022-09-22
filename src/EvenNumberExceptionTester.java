class InvalidEvenNumberException extends RuntimeException
{
    public InvalidEvenNumberException(String str)
    {
        super(str);
    }
}

public class EvenNumberExceptionTester {
    static void checkEvenNumber(int i)throws InvalidEvenNumberException
    {
        if(i%2!=0)
            throw new InvalidEvenNumberException("The given number is not even");
        else
            System.out.println("The given number "+i+" is even");
    }

    public static void main(String[] args) {
        try{
            checkEvenNumber(5);
        }
        catch (InvalidEvenNumberException e) {
            System.out.println(e.getMessage());
        }
    }

}
