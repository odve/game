package org.odve.lang.libraries.order;

import org.junit.Test;
import org.odve.model.Player;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author evdokimov evgenii
 */

public class RoundRobinOrderTest {

    private static Player WHITE = new Player("white");
    private static Player BLACK = new Player("black");

    @Test
    public void testCreateOrder() {
        Map<String, Player> playerMap = new HashMap<>();
        playerMap.put(WHITE.getRole(), WHITE);
        playerMap.put(BLACK.getRole(), BLACK);

        RoundRobinOrder order = (RoundRobinOrder) Order.createOrder(
                "RoundRobin",
                asList(WHITE.getRole(), BLACK.getRole()),
                playerMap);

        assertThat(order.getActivePlayer()).isSameAs(WHITE);
        order.endTurn();
        assertThat(order.getActivePlayer()).isSameAs(BLACK);
        order.endTurn();
        assertThat(order.getActivePlayer()).isSameAs(WHITE);
    }
}
