package org.odve.lang.libraries.order;

import java.util.List;

/**
 * @author evdokimov evgenii
 */

public class RoundRobinOrder implements Order {

    private final String[] playerNames;
    private int activePlayer;

    public RoundRobinOrder(final List<String> playerNames) {
        this.playerNames = playerNames.toArray(new String[0]);
        this.activePlayer = 0;
    }

    @Override
    public String getActivePlayer() {
        return playerNames[activePlayer];
    }

    @Override
    public void endTurn() {
        activePlayer = (activePlayer + 1) % playerNames.length;
    }
}
