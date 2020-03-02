package org.odve.lang.libraries.board;

import org.odve.util.Pair;

/**
 * @author evdokimov evgenii
 */

public class SquareBoard {

    private final int x;
    private final int y;
    private final Cell[][] cells;

    public SquareBoard(int x, int y, CellFactory cellFactory) {
        this.x = x;
        this.y = y;

        cells = new Cell[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cells[i][j] = cellFactory.createCell(i, j);
            }
        }
    }

    public Pair getSize() {
        return Pair.of(x, y);
    }

    public Cell getCell(int x, int y) {
        if (x < 0 || x >= this.x || y < 0 || y >= this.y) {
            throw new IllegalArgumentException("incorrect x,y pare: " + x + ", " + y);
        }

        return cells[x][y];
    }
}
