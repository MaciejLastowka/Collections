package pl.waw.great.Collections;


public class MyArrayList implements MyList {

    private final String[] elements = new String[16];
    private int index = 0;

    public MyArrayList() {
    }

    @Override
    public boolean add(String element) {
        elements[index] = element;
        this.index++;
        return true;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public String set(int index, String element) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        String oldRef = this.elements[index];
        this.elements[index] = element;
        return oldRef;
    }

    @Override
    public String remove(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        String removed = this.elements[index];
        this.elements[index] = null;

        for (int i = 0; i < this.size(); i++) {
            this.elements[i] = this.elements[i + 1];
        }
        return removed;
    }

    @Override
    public boolean remove(String o) {
        int index = this.indexOf(o);
        String in = this.remove(index);
        return in != null;
    }

    @Override
    public int indexOf(String element) {
        for (int i = 0; i < this.size(); i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return index;
    }
}
