package org.odve.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.odve.lang.libraries.board.SquareBoard;
import org.odve.lang.libraries.order.Order;

import java.util.List;

/**
 * @author evdokimov evgenii
 */

@Builder
@Getter
@ToString
public class GameRules {

    private final String name;

    private final List<Player> players;

    private final Order order;

    private final SquareBoard board;
}
