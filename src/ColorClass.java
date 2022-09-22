import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

enum Color{
    RED,
    GREEN,
    BLUE,
    ;


}

public class ColorClass implements MysteryColorAnalyzer{
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        HashSet<Color> h1=new HashSet<>(mysteryColors);
        return h1.size();

    }
    @Override
    public int colorOccurrence(List<Color> mysteryColors,Color color) {
        int count=0;
       for(Color c1:mysteryColors)
       {

           if(c1.equals(color))
               count++;
       }

return count;
    }

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(Color.RED);
        list.add(Color.BLUE);
        list.add(Color.RED);
        list.add(Color.GREEN);
        System.out.println(new ColorClass().numberOfDistinctColors(list));
        System.out.println(new ColorClass().colorOccurrence(list,Color.BLUE));





    }


}
