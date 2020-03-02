package org.odve.lang;

import org.junit.Before;
import org.junit.Test;
import org.odve.lang.libraries.board.SquareBoard;
import org.odve.model.GameRules;
import org.odve.model.Player;
import org.odve.util.Pair;
import org.odve.utils.FileUtils;

import java.io.FileInputStream;
import java.io.InputStream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author evdokimov evgenii
 */

public class GameRulesParserTest {

    private GameRules rules;

    @Before
    public void setUp() throws Exception {

        GameRulesParser parser = new GameRulesParser();
        String path = FileUtils.getPath("chess.txt");


        try (InputStream chess = new FileInputStream(path)) {
            rules = parser.parse(chess);
        }
    }

    @Test
    public void testGame() {
        assertThat(rules.getName()).isEqualTo("chess");
    }

    @Test
    public void testPlayersOrder() {
        assertThat(rules.getPlayers())
                .isEqualTo(asList(new Player("white"), new Player("black")));
        assertThat(rules.getOrder().getActivePlayer()).isSameAs(rules.getPlayers().get(0));
    }

    @Test
    public void testBoard() {
        SquareBoard board = rules.getBoard();

        assertThat(board.getSize()).isEqualTo(Pair.of(8, 8));
        assertThat(board.getCell(0, 0).getName()).isEqualTo("A1");
        assertThat(board.getCell(7, 7).getName()).isEqualTo("H8");
    }
}
