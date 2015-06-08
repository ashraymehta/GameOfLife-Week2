package com.thoughtworks.pathashala;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class CellTest {
    @Test
    public void testCellEqualityIsReflexive() throws Exception {
        Cell cell = new Cell(1, 1);
        Cell replicaCell = new Cell(1, 1);

        assertEquals(cell, replicaCell);
    }

    @Test
    public void testCellsAreNotEqualWhenTheyDontHaveTheSamePosition() throws Exception {
        Cell firstCell = new Cell(1, 1);
        Cell secondCell = new Cell(3, 3);

        assertNotEquals(firstCell, secondCell);
    }

    @Test
    public void testGetNeighboursForCell() throws Exception {
        Cell cell = new Cell(2, 2);

        ArrayList<Cell> expectedCells = new ArrayList<>();
        expectedCells.add(new Cell(1, 1));
        expectedCells.add(new Cell(1, 2));
        expectedCells.add(new Cell(1, 3));
        expectedCells.add(new Cell(2, 1));
        expectedCells.add(new Cell(2, 2));
        expectedCells.add(new Cell(2, 3));
        expectedCells.add(new Cell(3, 1));
        expectedCells.add(new Cell(3, 2));
        expectedCells.add(new Cell(3, 3));
        ArrayList<Cell> actualCells = cell.getNeighbours();

        assertTrue(actualCells.containsAll(expectedCells));
    }
}
