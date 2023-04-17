package pl.waw.great.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    private MyLinkedList list;

    @BeforeEach
    void setUp() {
        list = new MyLinkedList();
        list.add("Bulka");
        list.add("Chleb");
        list.add("Maslo");
        list.add("Maka");
        list.add("Drozdze");
        list.add("Cukier");
        list.add("Ziarna");
    }

    @Test
    void add() {
        //then
        assertEquals("Bulka", list.get(0));
        assertEquals("Chleb", list.get(1));
        assertEquals("Maslo", list.get(2));
        assertEquals("Maka", list.get(3));
        assertEquals("Drozdze", list.get(4));
        assertEquals("Cukier", list.get(5));
        assertEquals("Ziarna", list.get(6));
    }

    @Test
    void get() {
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        for (int j = 0; j < 100; j++) {
            assertEquals(String.valueOf(j), list.get(j));
        }
    }

    @Test
    void set() {
        // When
        String result1 = list.set(0, "Bulka");
        String result3 = list.set(5, "Kaczka");

        // Then
        assertEquals("Bulka", result1);
        assertEquals("Bulka", list.get(0));
        assertEquals("Kaczka", result3);
        assertEquals("Kaczka", list.get(6));
    }

    @Test
    void testRemoveByValue() {
        assertTrue(list.remove("Maslo")); // Remove element "Maslo" by value
        assertEquals(5, list.size()); // Check if size of the list is decreased by 1
    }

    @Test
    void testRemoveByInvalidIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(7));
    }

    @Test
    void testRemoveByInvalidValue() {
        assertFalse(list.remove("Jajka"));
        assertEquals(6, list.size());
    }

    @Test
    void indexOf() {
        //when
        int index1 = list.indexOf("Chleb");
        int index2 = list.indexOf("Ziarna");

        // Then
        assertEquals(1, index1);
        assertEquals(5, index2);
        assertEquals(0, list.indexOf("Bulka"));
        assertEquals(5, list.indexOf("Ziarna"));
    }

    @Test
    void size() {

        assertEquals(6, list.size());
        list.remove(1);
        assertEquals(5, list.size());

        list.remove("NieistniejacyElement");
        assertEquals(5, list.size());

        list.remove("Maka");
        assertEquals(4, list.size());
    }
}
