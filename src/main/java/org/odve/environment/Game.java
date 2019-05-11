package org.odve.environment;

import lombok.Value;
import org.odve.model.GameRules;
import org.odve.model.Player;

import java.util.Map;

/**
 * @author evdokimov evgenii
 */

@Value
public class Game {

    private final long id;

    private final GameRules rules;

    private final Map<Player, User> players;
}
