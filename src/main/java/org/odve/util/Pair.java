package org.odve.util;

import lombok.Value;

@Value
public class Pair {
    private final int x;
    private final int y;

    public static Pair of(int x, int y) {
        return new Pair(x, y);
    }
}
