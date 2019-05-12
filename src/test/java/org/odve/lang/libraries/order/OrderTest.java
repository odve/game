package org.odve.lang.libraries.order;

import org.junit.Test;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author evdokimov evgenii
 */

public class OrderTest {

    @Test
    public void testCreateOrder() {
        Order order = Order.createOrder("RoundRobin", emptyList(), emptyMap());
        assertThat(order).isInstanceOf(RoundRobinOrder.class);
    }
}
