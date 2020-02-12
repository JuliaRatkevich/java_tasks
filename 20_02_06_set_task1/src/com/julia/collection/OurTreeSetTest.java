package com.julia.collection;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OurTreeSetTest {
    private OurTreeSet<Integer> ourTreeSet = new OurTreeSet<>();

    @org.junit.Test
    public void testSize_EmptySet_Zero() {
        assertEquals(0, ourTreeSet.size());
    }

    @org.junit.Test
    public void testAdd_SetWithOneVertex_OneElement() {
        Integer sample = 5;
        ourTreeSet.add(sample);
        assertEquals(1, ourTreeSet.size());
    }

    @org.junit.Test
    public void testAdd_SetWithTreeElements_TreeElement() {
        Integer sample01 = 5;
        Integer sample02 = 1;
        Integer sample03 = 2;
        ourTreeSet.add(sample01);
        ourTreeSet.add(sample02);
        ourTreeSet.add(sample03);
        assertEquals(3, ourTreeSet.size());
    }

    @org.junit.Test
    public void testContains_SetWithTreeElements_True() {
        Integer sample01 = 5;
        Integer sample02 = 1;
        Integer sample03 = 2;
        ourTreeSet.add(sample01);
        ourTreeSet.add(sample02);
        ourTreeSet.add(sample03);
        assertTrue(ourTreeSet.contains(sample01));
    }

    @org.junit.Test
    public void testContains_SetWithTreeElements_False() {
        Integer sample01 = 5;
        Integer sample02 = 1;
        Integer sample03 = 2;
        Integer sample04 = 8;
        ourTreeSet.add(sample01);
        ourTreeSet.add(sample02);
        ourTreeSet.add(sample03);
        assertFalse(ourTreeSet.contains(sample04));
    }

    @org.junit.Test
    public void testRemove_SetThreeElementsWithoutBothChildrenRemoveLastElement_TwoElements() {
        Integer sample01 = 10;
        Integer sample02 = 18;
        Integer sample03 = 19;
        ourTreeSet.add(sample01);
        ourTreeSet.add(sample02);
        ourTreeSet.add(sample03);
        ourTreeSet.remove(sample03);
        assertEquals(2, ourTreeSet.size());
        assertFalse(ourTreeSet.contains(sample03));
    }

    @org.junit.Test
    public void testRemove_SetThreeElementsWithoutBothChildrenRemoveMiddleElement_TwoElements() {
        Integer sample01 = 10;
        Integer sample02 = 18;
        Integer sample03 = 19;
        ourTreeSet.add(sample01);
        ourTreeSet.add(sample02);
        ourTreeSet.add(sample03);
        ourTreeSet.remove(sample02);
        assertEquals(2, ourTreeSet.size());
        assertFalse(ourTreeSet.contains(sample02));
    }

    @org.junit.Test
    public void testRemove_SetThreeElementsWithoutBothChildrenRemoveFirstElement_TwoElements() {
        Integer sample01 = 10;
        Integer sample02 = 18;
        Integer sample03 = 19;
        ourTreeSet.add(sample01);
        ourTreeSet.add(sample02);
        ourTreeSet.add(sample03);
        ourTreeSet.remove(sample01);
        assertEquals(2, ourTreeSet.size());
        assertFalse(ourTreeSet.contains(sample01));
    }

    @org.junit.Test
    public void testRemove_SetFourElementsWithBothChildrenRemoveLastElement_ThreeElements() {
        Integer sample01 = 10;
        Integer sample02 = 18;
        Integer sample03 = 19;
        Integer sample04 = 17;
        ourTreeSet.add(sample01);
        ourTreeSet.add(sample02);
        ourTreeSet.add(sample03);
        ourTreeSet.add(sample04);
        ourTreeSet.remove(sample03);
        assertEquals(3, ourTreeSet.size());
        assertFalse(ourTreeSet.contains(sample03));
    }

    @org.junit.Test
    public void testRemove_SetFourElementsWithBothChildrenRemoveMiddleElement_ThreeElements() {
        Integer sample01 = 10;
        Integer sample02 = 18;
        Integer sample03 = 19;
        Integer sample04 = 17;
        ourTreeSet.add(sample01);
        ourTreeSet.add(sample02);
        ourTreeSet.add(sample03);
        ourTreeSet.add(sample04);
        ourTreeSet.remove(sample02);
        assertEquals(3, ourTreeSet.size());
        assertFalse(ourTreeSet.contains(sample02));
    }

    @org.junit.Test
    public void testRemove_SetFourElementsWithBothChildrenRemoveFirstElement_ThreeElements() {
        Integer sample01 = 10;
        Integer sample02 = 18;
        Integer sample03 = 19;
        Integer sample04 = 17;
        ourTreeSet.add(sample01);
        ourTreeSet.add(sample02);
        ourTreeSet.add(sample03);
        ourTreeSet.add(sample04);
        ourTreeSet.remove(sample01);
        assertEquals(3, ourTreeSet.size());
        assertFalse(ourTreeSet.contains(sample01));
    }

    @Test
    public void addAll_updates_set_with_element_from_other() {
        OurSet<Integer> set = new OurTreeSet<>() ;
        set.add(1);
        set.add(2);
        set.add(3);

        OurSet<Integer> otherSet = new OurTreeSet<>() ;
        otherSet.add(1);
        otherSet.add(4);
        otherSet.add(5);

        Integer[] expected = {1, 2, 3, 4, 5};

        set.addAll(otherSet);

        Assert.assertEquals(set.size(), expected.length);
        for (Integer element : expected) {
            Assert.assertTrue(set.contains(element));
        }
    }

    @Test
    public void removeAll_removes_elements_that_are_in_other_set() {
        OurSet<Integer> set = new OurTreeSet<>() ;
        set.add(1);
        set.add(2);
        set.add(3);

        OurSet<Integer> otherSet = new OurTreeSet<>() ;
        otherSet.add(1);
        otherSet.add(2);
        otherSet.add(4);
        otherSet.add(5);

        Integer[] expected = {3};

        set.removeAll(otherSet);

        Assert.assertEquals(set.size(), expected.length);
        for (Integer element : expected) {
            Assert.assertTrue(set.contains(element));
        }
    }

    @Test
    public void retainAll_keeps_only_elements_that_are_in_other_set() {
        OurSet<Integer> set = new OurTreeSet<>() ;
        set.add(1);
        set.add(2);
        set.add(8);
        set.add(2);

        OurSet<Integer> otherSet = new OurTreeSet<>() ;
        otherSet.add(1);
        otherSet.add(5);
        otherSet.add(4);
        otherSet.add(2);

        Integer[] expected = {1,2};

        set.retainAll(otherSet);

        Assert.assertEquals(set.size(), expected.length);
        for (Integer element : expected) {
            Assert.assertTrue(set.contains(element));
        }
    }
}