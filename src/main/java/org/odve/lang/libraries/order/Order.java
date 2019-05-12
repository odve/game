package org.odve.lang.libraries.order;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author evdokimov evgenii
 */

public interface Order {

    static Order createOrder(String name, List<String> params) {
        Class<?> clazz;
        try {
            clazz = Class.forName("org.odve.lang.libraries.order." + name + "Order");
            Constructor<?> ctor = clazz.getConstructor(List.class);
            return (Order) ctor.newInstance(new Object[]{params});
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    String getActivePlayer();

    void endTurn();
}
