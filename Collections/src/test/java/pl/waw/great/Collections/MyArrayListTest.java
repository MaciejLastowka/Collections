package pl.waw.great.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private MyArrayList list;

    @BeforeEach
    void setUp(){
        list = new MyArrayList();
        list.add("Bułka");
        list.add("Chleb");
        list.add("Masło");
    }

    @Test
    void add() {
        list.size();
        assertEquals(3, list.size());
    }

    @Test
    void get() {
        String index = (list.get(0));
        assertEquals("Bułka", index);
    }

    @Test
    void set() {
        String chleb = list.set(1, "BURAK");

        assertEquals("Chleb", chleb);
        assertEquals(list.get(1), "BURAK");
    }

    @Test
    void remove() {
        String remove = list.remove(0);

        assertEquals("Bułka", remove);
        assertEquals(list.get(0), "Chleb");
        assertEquals(list.get(1), "Masło");
    }

    @Test
    void testRemove() {
        boolean isRemoved = list.remove("Bułka");

        assertTrue(isRemoved);
        assertEquals(list.get(0), "Chleb");
        assertEquals(list.get(1), "Masło");
    }

    @Test
    void indexOf() {
        assertEquals(0, list.indexOf("Bułka"));
    }
}


