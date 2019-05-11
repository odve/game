package org.odve.it;

import org.junit.Before;
import org.junit.Test;
import org.odve.lang.GameRulesParser;
import org.odve.environment.Game;
import org.odve.model.GameFactory;
import org.odve.model.GameRules;
import org.odve.utils.FileUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author evdokimov evgenii
 */

public class ChessIT {

    private GameRules chess;

    @Before
    public void init() throws IOException {
        GameRulesParser parser = new GameRulesParser();

        String path = FileUtils.getPath("chess.txt");
        try (InputStream file = new FileInputStream(path)) {
            chess = parser.parse(file);
        }
    }

    @Test
    public void testNewGame() {
        Game game = new GameFactory(chess).newGame();
        System.out.println(game);
    }

}
