package org.odve.model;

import org.odve.environment.Game;
import org.odve.environment.User;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author evdokimov evgenii
 */

public class GameFactory {

    private GameRules rules;
    private static AtomicLong id = new AtomicLong();

    public GameFactory(final GameRules rules) {
        this.rules = rules;
    }

    public Game newGame() {
        HashMap<Player, User> players = new HashMap<>();
        for (Player p : rules.getPlayers()) {
            players.put(p, new User(1, p.getRole()));
        }
        return new Game(id.incrementAndGet(), rules, players);
    }
}
