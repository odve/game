package org.odve.lang.libraries.board;

/**
 * @author evdokimov evgenii
 */

public class ChessCell implements Cell {

    public static class Factory implements CellFactory {

        public Cell createCell(int x, int y) {
            return new ChessCell(x, y);
        }
    }

    private final String name;

    private ChessCell(int x, int y) {
        name = getCharForNumber(x) + (y + 1);
    }

    @Override
    public String getName() {
        return name;
    }

    private String getCharForNumber(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("letter number must be positive: " + i);
        }

        if (i < 27) {
            return String.valueOf((char) (i + 'A'));
        }

        return getCharForNumber(i / 27) + getCharForNumber(i % 27);
    }
}
