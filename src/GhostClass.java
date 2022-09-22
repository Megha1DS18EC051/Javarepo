import java.util.Random;

/*
	Main Class
*/
import java.util.Random;

class Ghost {
    final String[] colors = {"white", "yellow", "purple", "red"};

    public String getColor() {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }

}



public class GhostClass {

    public static void main(String[] args) {

        Ghost ghost = new Ghost();
        System.out.println(ghost.getColor());
    }

}