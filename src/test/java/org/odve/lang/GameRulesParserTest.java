package org.odve.lang;

import org.junit.Before;
import org.junit.Test;
import org.odve.model.GameRules;
import org.odve.model.Player;
import org.odve.utils.FileUtils;

import java.io.FileInputStream;
import java.io.InputStream;

import static java.util.Arrays.asList;
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
        String path = FileUtils.getPath("chess.txt");

        GameRules rules;
        try (InputStream chess = new FileInputStream(path)) {
            rules = parser.parse(chess);
        }

        assertThat(rules.getName()).isEqualTo("chess");
        assertThat(rules.getPlayers())
                .isEqualTo(asList(new Player("white"), new Player("black")));
    }
}
