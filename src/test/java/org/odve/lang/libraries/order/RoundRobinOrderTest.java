package org.odve.lang.libraries.order;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author evdokimov evgenii
 */

public class RoundRobinOrderTest {

    @Test
    public void testCreateOrder() {
        RoundRobinOrder order = (RoundRobinOrder) Order.createOrder("RoundRobin", asList("white", "black"));

        assertThat(order.getActivePlayer()).isEqualTo("white");
        order.endTurn();
        assertThat(order.getActivePlayer()).isEqualTo("black");
        order.endTurn();
        assertThat(order.getActivePlayer()).isEqualTo("white");
    }
}
