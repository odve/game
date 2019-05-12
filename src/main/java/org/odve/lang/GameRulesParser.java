package org.odve.lang;

import lombok.extern.slf4j.Slf4j;
import org.odve.model.GameRules;
import org.odve.parser.ParseException;
import org.odve.parser.Parser;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author evdokimov evgenii
 */

@Slf4j
public class GameRulesParser {

    private Parser parser;

    public GameRulesParser() {
        Class<?> clazz;
        try {
            clazz = Class.forName("org.odve.parser.Parser");
            Constructor<?> ctor = clazz.getConstructor();
            parser = (Parser) ctor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }

    public GameRules parse(InputStream rules) {
        log.debug("rules parsing started");

        RulesBuilder builder = new RulesBuilderImpl();

        try {
            parser.parse(rules, builder);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        log.debug("rules parsing finished");

        return builder.build();
    }
}
