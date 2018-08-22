package org.odve.lang;

import org.odve.model.GameRules;

/**
 * @author evdokimov evgenii
 */

public class GameRulesParser {

    public GameRules parse() {
        GameRules.GameRulesBuilder builder = GameRules.builder();
        builder.name("chess");

        return builder.build();
    }
}
