package com.thoughtworks.pathashala;

import java.util.ArrayList;

public class Cell {
    int x, y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        return x == cell.x && y == cell.y;

    }

    public ArrayList<Cell> getNeighbours() {
        ArrayList<Cell> neighbours = new ArrayList<Cell>();
        neighbours.add(new Cell(this.x - 1, this.y - 1));
        neighbours.add(new Cell(this.x, this.y - 1));
        neighbours.add(new Cell(this.x + 1, this.y - 1));
        neighbours.add(new Cell(this.x - 1, this.y));
        neighbours.add(new Cell(this.x, this.y));
        neighbours.add(new Cell(this.x + 1, this.y));
        neighbours.add(new Cell(this.x - 1, this.y + 1));
        neighbours.add(new Cell(this.x, this.y + 1));
        neighbours.add(new Cell(this.x + 1, this.y + 1));
        return neighbours;
    }
}
