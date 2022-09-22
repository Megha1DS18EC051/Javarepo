//wrapper class
/*short	   Short
  int	   Integer
  long	   Long
  float	   Float
  double   Double
  char	   Character
  byte	   Byte
 boolean   Boolean

 */
public class WrapperExample {

    public static void main(String[] args) throws Exception {

        Integer i = Integer.valueOf(5);
        Integer j = Integer.valueOf("6");

        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}

