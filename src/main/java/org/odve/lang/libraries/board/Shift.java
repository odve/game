package org.odve.lang.libraries.board;

/**
 * @author evdokimov evgenii
 */

public enum Shift {

    NW(-1, 1), N(0, 1), NE(1, 1),
    W(-1, 0), O(0, 0), E(1, 0),
    SW(-1, -1), S(0, -1), SE(1, -1);

    private final int x;
    private final int y;

    Shift(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
