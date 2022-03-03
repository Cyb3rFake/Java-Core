package com.TestPack;

import org.junit.jupiter.api.Test;

class MainTest {


    @Test
    void write() {
    }

    @Test
    void testWrite() {
        Main main = new Main();
        main.write("Hello World!");
        main.write("Hello World!", 10);
    }

}