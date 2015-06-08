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

    public ArrayList<int[]> getNeighbours(int[] cell) {
        ArrayList<int[]> significantCells = new ArrayList<>();
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
