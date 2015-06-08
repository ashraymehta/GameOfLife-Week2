package com.thoughtworks.pathashala;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class GridTest {

    @org.junit.Test
    public void testGetCellsWithFewerThanTwoAliveNeighboursWithASingleCellAlive() throws Exception {
        ArrayList<Cell> aliveCells = new ArrayList<>();
        aliveCells.add(new Cell(1, 1));
        Grid grid = new Grid(aliveCells);

        ArrayList<Cell> actualCells = grid.getCellsWithFewerThanTwoAliveNeighbours();
        ArrayList<Cell> expectedCells = aliveCells;

        assertEquals(expectedCells, actualCells);
    }

    @Test
    public void testGetAllNeighboursForACellWithASingleCellAlive() throws Exception {
        ArrayList<Cell> aliveCells = new ArrayList<>();
        aliveCells.add(new Cell(1, 1));
        Grid grid = new Grid(aliveCells);

        ArrayList<Cell> actualCells = grid.getNeighbours(new Cell(2, 2));
        ArrayList<Cell> expectedCells = aliveCells;

        assertEquals(expectedCells, actualCells);
    }
}
