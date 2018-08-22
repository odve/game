package org.odve.lang;

import org.junit.Before;
import org.junit.Test;
import org.odve.model.GameRules;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

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
    public void createGame() throws Exception {
        URL url = Thread.currentThread().getContextClassLoader().getResource("chess.txt");
        assertThat(url).isNotNull();

        GameRules rules;
        try (InputStream chess = new FileInputStream(url.getPath())) {
            rules = parser.parse(chess);
        }

        assertThat(rules.getName()).isEqualTo("chess");
    }
}
