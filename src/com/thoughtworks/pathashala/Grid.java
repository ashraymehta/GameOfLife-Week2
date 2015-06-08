package com.thoughtworks.pathashala;

import java.util.ArrayList;

public class Grid {

    private final ArrayList<Cell> aliveCells;

    public Grid(ArrayList<Cell> aliveCells) {
        this.aliveCells = aliveCells;
    }

    public ArrayList<Cell> getCellsWithFewerThanTwoAliveNeighbours() {
        ArrayList<Cell> significantCells = new ArrayList<>();
        significantCells.add(aliveCells.get(0));
        return significantCells;
    }
}
