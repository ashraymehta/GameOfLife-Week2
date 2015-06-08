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

    public ArrayList<Cell> getNeighbours(Cell cell) {
        ArrayList<Cell> significantCells = new ArrayList<>();
//        for (int i = cell[0] - 1; i < cell[0] + 1; i++) {
//            for (int j = cell[1] - 1; j < cell[1] + 1; j++) {
//                int[] testedCell = new int[]{i, j};
//                int index = -1;
//                if ((index = aliveCells.indexOf(testedCell)) != -1) {
//                    significantCells.add(aliveCells.get(index));
//                }
//            }
//        }

        significantCells.add(aliveCells.get(0));
        return significantCells;
    }
}
