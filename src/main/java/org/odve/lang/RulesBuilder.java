package org.odve.lang;

import org.odve.model.GameRules;

import java.util.List;

/**
 * @author evdokimov evgenii
 */

public interface RulesBuilder {

    GameRules build();

    void name(String name);

    void players(List<String> playerNames);

    void order(String orderName, List<String> params);
}
