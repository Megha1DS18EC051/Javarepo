import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer temp;
    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (!hasNext()) return null;
        if (temp == null) {
            temp = iterator.next();
        }
        return temp;
    }


    @Override
    public Integer next() {
        if (!hasNext()) return null;
        if (temp == null) {
            Integer next = iterator.next();
            return next;
        } else {
            Integer next = temp;
            temp = null;
            return next;
        }
    }

    @Override
    public boolean hasNext() {
        return temp != null || iterator.hasNext();
    }

    public static void main(String[] args) {
        System.out.println(new PeekingIterator[]{});

    }

}


