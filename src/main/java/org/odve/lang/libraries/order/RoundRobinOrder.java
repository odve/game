package org.odve.lang.libraries.order;

import org.odve.model.Player;

import java.util.List;
import java.util.Map;

/**
 * @author evdokimov evgenii
 */

public class RoundRobinOrder implements Order {

    private final Player[] players;
    private int activePlayer;

    public RoundRobinOrder(final List<String> playerNames, final Map<String, Player> playerMap) {
        this.players = playerNames
                .stream()
                .map(playerMap::get)
                .toArray(Player[]::new);

        this.activePlayer = 0;
    }

    @Override
    public Player getActivePlayer() {
        return players[activePlayer];
    }

    @Override
    public void endTurn() {
        activePlayer = (activePlayer + 1) % players.length;
    }
}
