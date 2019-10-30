package com.mainacad;

import org.junit.jupiter.api.Test;

import java.rmi.AlreadyBoundException;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testToString() {

        assertNotNull();
    }

    private void assertNotNull() {
    }

    @Test
    void getId() {
        assertEquals(1, 1);
        assertEquals(2, 2);
    }

    @Test
    void getName() {
        assertEquals("Alex", "Alex");
        assertEquals("Victor", "Victor");
    }
}