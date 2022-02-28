package com.skillbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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