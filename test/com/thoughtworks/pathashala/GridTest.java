package com.thoughtworks.pathashala;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class GridTest {

    @org.junit.Test
    public void testGetCellsWithFewerThanTwoAliveNeighboursWithASingleCellAlive() throws Exception {
        ArrayList<int[]> aliveCells = new ArrayList<>();
        aliveCells.add(new int[]{1, 1});
        Grid grid = new Grid(aliveCells);

        ArrayList<int[]> actualCells = grid.getCellsWithFewerThanTwoAliveNeighbours();
        ArrayList<int[]> expectedCells = aliveCells;

        assertEquals(expectedCells, actualCells);
    }
}
