package com.thoughtworks.pathashala;

import java.util.ArrayList;

public class Grid {

    private final ArrayList<int[]> aliveCells;

    public Grid(ArrayList<int[]> aliveCells) {
        this.aliveCells = aliveCells;
    }

    public ArrayList<int[]> getCellsWithFewerThanTwoAliveNeighbours() {
        ArrayList<int[]> significantCells = new ArrayList<>();
        significantCells.add(aliveCells.get(0));
        return significantCells;
    }
}
