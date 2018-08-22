package org.odve.lang;

import lombok.extern.slf4j.Slf4j;
import org.odve.model.GameRules;

import java.io.InputStream;

/**
 * @author evdokimov evgenii
 */

@Slf4j
public class GameRulesParser {

    public GameRules parse(InputStream rules) {
        log.debug("rules parsing started");

        GameRules.GameRulesBuilder builder = GameRules.builder();
        builder.name("chess");

        log.debug("rules parsing finished");
        return builder.build();
    }
}
