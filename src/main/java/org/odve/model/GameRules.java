package org.odve.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

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
}
