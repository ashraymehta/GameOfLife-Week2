package com.thoughtworks.pathashala;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CellTest {
    @Test
    public void testCellEqualityIsReflexive() throws Exception {
        Cell cell = new Cell(1, 1);
        Cell replicaCell = new Cell(1, 1);

        assertEquals(cell, replicaCell);
    }
}
