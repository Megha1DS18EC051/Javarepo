import java.util.List;
import java.util.ArrayList;

public class Library implements Media{
    private List resources = new ArrayList();
    public void addMedia(Media x) {
        resources.add(x);
    }
    public Media retrieveLast() {
        int size = resources.size();
        if (size > 0) {
            return (Media)resources.get(size - 1);
        }
        return null;
    }

    public static void main(String[] args) {
        Library lib=new Library();

    }
}

interface Media {
}

interface Book extends Media {
}

interface Video extends Media {
}

interface Newspaper extends Media {
}


