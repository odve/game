package org.odve.lang.libraries.order;

import org.odve.model.Player;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @author evdokimov evgenii
 */

public interface Order {

    static Order createOrder(String name, List<String> params, Map<String, Player> playerMap) {
        Class<?> clazz;
        try {
            clazz = Class.forName("org.odve.lang.libraries.order." + name + "Order");
            Constructor<?> ctor = clazz.getConstructor(List.class, Map.class);
            return (Order) ctor.newInstance(new Object[]{params, playerMap});
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    Player getActivePlayer();

    void endTurn();
}
