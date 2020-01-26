package com.julia.collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class OurHashMapTest {

    OurHashMap map = new OurHashMap<Integer, String>();

    @Before
    public void setUp() throws Exception {
        map.put(1, "1");
        map.put(10001, "10001");
        map.put(20001, "20001");
        map.put(2, "2");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void get() {
        assertEquals(map.get(1),"1");
        assertEquals(map.get(2),"2");

    }

    @Test
    public void contains() {
        assertTrue(map.contains(1));
        assertTrue(map.contains(10001));
        assertTrue(map.contains(20001));
        assertTrue(map.contains(2));
        assertFalse(map.contains(5));
    }

    @Test
    public void remove() {
        assertTrue(map.remove(1));
        assertFalse(map.contains(1));
        assertTrue(map.remove(2));
        assertFalse(map.contains(2));
    }

    @Test
    public void size() {
        assertEquals(4, map.size());
        assertTrue(map.remove(1));
        assertEquals(3, map.size());
        assertTrue(map.remove(1));
        assertEquals(3, map.size());
    }
}