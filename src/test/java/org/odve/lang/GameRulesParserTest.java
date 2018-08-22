package org.odve.lang;

import org.junit.Before;
import org.junit.Test;
import org.odve.model.GameRules;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author evdokimov evgenii
 */

public class GameRulesParserTest {

    private GameRulesParser parser;

    @Before
    public void setUp() {
        parser = new GameRulesParser();
    }

    @Test
    public void createGame() {
        GameRules rules = parser.parse();
        assertThat(rules.getName()).isEqualTo("chess");
    }
}
