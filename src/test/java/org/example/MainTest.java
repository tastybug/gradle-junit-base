package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void name() {
        assertThat("1").isEqualTo("1");
        assertEquals("1", "1");
    }

}