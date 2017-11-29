package com.rj.cci.test;


import com.rj.cci.src.P02;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P02Test {

    @Test
    void test1() {
        Assertions.assertEquals(0, P02.numberNeeded("aaaaaaa", "aaaaaaa"));
    }

    void test2() {
        assertEquals(2, P02.numberNeeded("abcde", "edboa"));
    }
}