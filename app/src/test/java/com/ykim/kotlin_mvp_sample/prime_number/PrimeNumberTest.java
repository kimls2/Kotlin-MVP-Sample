package com.ykim.kotlin_mvp_sample.prime_number;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by ykim on 2017. 7. 6..
 */
public class PrimeNumberTest extends TestCase {

    @Test
    public void testOne() {
        int[] nullArray = PrimeNumber.generatePrimes(0);
        assertEquals(nullArray.length, 0);
    }

    @Test
    public void testTwo() {
        int[] minArray = PrimeNumber.generatePrimes(2);
        assertEquals(minArray.length, 1);
        assertEquals(minArray[0], 2);
    }
}