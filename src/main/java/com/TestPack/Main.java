package com.TestPack;

public class Main {
    public static void main(String[] args) {
        write("Hello World!");
        write("Hello World!", 10);

    }

    /**
     * Напечатать текст
     * @param text
     */
    public static void write(String text) {
        System.out.printf("%s\n", text);
    }

    /**
     * Напечатать текст n-раз
     * @param text
     * @param repeat
     */
    public static void write(String text, int repeat) {
        for (int i = 0; i < repeat; i++)
            System.out.printf("%s %s\n", text, i + 1);
    }
}
