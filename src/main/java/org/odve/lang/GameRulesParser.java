package org.odve.lang;

import org.odve.model.GameRules;

import java.io.InputStream;

/**
 * @author evdokimov evgenii
 */

public class GameRulesParser {

    public GameRules parse(InputStream rules) {
        GameRules.GameRulesBuilder builder = GameRules.builder();
        builder.name("chess");

        return builder.build();
    }
}
