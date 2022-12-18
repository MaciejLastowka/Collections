package pl.waw.great.Collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyArrayListTest {

    @Test
    void add() {
        MyArrayList list = new MyArrayList();

        list.add("Bułka");
        list.add("Chleb");

        list.size();
        assertEquals(2, list.size());

    }

    @Test
    void get() {
        MyArrayList list = new MyArrayList();
        list.add("Bułka");
        list.add("Chleb");
        String s = (list.get(0));
        assertEquals("Bułka", s );
    }

    @Test
    void set() {
        MyArrayList list = new MyArrayList();
        list.add("Bułka");
        list.add("Chleb");

        String Chleb = list.set(1, "BURAK");
        assertEquals("Chleb",Chleb);
        assertEquals(list.get(1), "BURAK");

    }

    @Test
    void remove() {
        MyArrayList list = new MyArrayList();
        list.add("Bułka");
        list.add("Chleb");
        list.add("Masło");

        String remove = list.remove(0);

        assertEquals("Bułka", remove);
        assertEquals(list.get(0), "Chleb");
        assertEquals(list.get(1), "Masło");
    }

    @Test
    void testRemove() {
        MyArrayList list = new MyArrayList();
        list.add("Bułka");
        list.add("Chleb");
        list.add("Masło");

        boolean isRemoved = list.remove("Bułka");

        assertEquals(list.get(0), "Chleb");
        assertEquals(list.get(1), "Masło");

    }

    @Test
    void indexOf() {
        MyArrayList list = new MyArrayList();
        list.add("Bułka");
        list.add("Chleb");
        list.add("Masło");

        boolean isRemoved = list.remove("Bułka");
        assertTrue(isRemoved);

        assertEquals(list.get(0), "Chleb");
        assertEquals(list.get(1), "Masło");

    }
}


 