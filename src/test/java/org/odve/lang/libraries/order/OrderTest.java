package org.odve.lang.libraries.order;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author evdokimov evgenii
 */

public class OrderTest {

    @Test
    public void testCreateOrder() {
        Order order = Order.createOrder("RoundRobin", asList("white", "black"));
        assertThat(order).isInstanceOf(RoundRobinOrder.class);
    }
}
