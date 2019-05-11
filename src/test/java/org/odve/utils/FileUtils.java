package org.odve.utils;

import lombok.extern.slf4j.Slf4j;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author evdokimov evgenii
 */

@Slf4j
public class FileUtils {

    public static String getPath(String fileName) {
        URL url = Thread.currentThread().getContextClassLoader().getResource(fileName);
        assertThat(url).isNotNull();

        String path = url.getPath();
        log.info("file path: " + path);

        return path;
    }
}
