package pl.waw.great.Collections;

public class Element {
    public Element(String value, Element next) {
        this.value = value;
        this.next = next;
    }

    private String value;
    private Element next;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
