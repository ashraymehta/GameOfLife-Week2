package com.thoughtworks.pathashala;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CellTest {
    @Test
    public void testCellEqualityIsReflexive() throws Exception {
        Cell cell = new Cell(1, 1);
        Cell replicaCell = new Cell(1, 1);

        assertEquals(cell, replicaCell);
    }

    @Test
    public void testCellsAreNotEqualWhenTheyreDontHaveTheSamePosition() throws Exception {
        Cell firstCell = new Cell(1, 1);
        Cell secondCell = new Cell(3, 3);

        assertNotEquals(firstCell, secondCell);
    }
}
