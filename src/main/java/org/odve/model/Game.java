package org.odve.model;

import lombok.Value;

/**
 * @author evdokimov evgenii
 */

@Value
public class Game {

    private final long id;
    private final GameRules rules;

}
