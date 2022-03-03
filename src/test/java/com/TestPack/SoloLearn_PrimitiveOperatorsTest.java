package com.TestPack;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

class SoloLearn_PrimitiveOperatorsTest {

    @Test
    void P1() {
        Scanner read = new Scanner("3644");
        int distance = read.nextInt();
        System.out.print(distance / 1000 + "\n" +distance % 1000 );
    }

    @Test
    void P2() {
        int math = 35;
        int history = 40;
        int geometry = 39;
        int sum = math + history + geometry;
        System.out.print(sum/60+"\n"+sum%60);
    }
}