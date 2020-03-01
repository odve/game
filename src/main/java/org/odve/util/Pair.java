package org.odve.model;

import lombok.Data;

@Data
public class Pair {
    private int x;
    private int y;

    public static Pair of(int x, int y) {
        return new Pair(x, y);
    }
}
