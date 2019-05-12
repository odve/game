package org.odve.lang;

import org.odve.lang.libraries.order.Order;
import org.odve.model.GameRules;
import org.odve.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author evdokimov evgenii
 */

public class RulesBuilderImpl implements RulesBuilder {

    private final GameRules.GameRulesBuilder builder;
    private final Map<String, Player> playerMap;

    public RulesBuilderImpl() {
        builder = GameRules.builder();
        playerMap = new HashMap<>();
    }

    @Override
    public GameRules build() {
        return builder.build();
    }

    @Override
    public void name(String name) {
        builder.name(name);
    }

    @Override
    public void players(List<String> playerNames) {
        List<Player> players = new ArrayList<>();
        for (String name : playerNames) {
            Player player = new Player(name);
            playerMap.put(name, player);
            players.add(player);
        }

        builder.players(players);
    }

    @Override
    public void order(String orderName, List<String> params) {
        Order order = Order.createOrder(orderName, params, playerMap);
        builder.order(order);
    }
}
