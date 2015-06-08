package com.thoughtworks.pathashala;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.core.Is.is;

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

    @Test
    public void testGetAllNeighboursForACellWithASingleCellAlive() throws Exception {
        ArrayList<int[]> aliveCells = new ArrayList<>();
        aliveCells.add(new int[]{1, 1});
        Grid grid = new Grid(aliveCells);

        ArrayList<int[]> actualCells = grid.getNeighbours(new int[] {2,2});
        ArrayList<int[]> expectedCells = aliveCells;

        assertEquals(expectedCells, actualCells);
    }
}
