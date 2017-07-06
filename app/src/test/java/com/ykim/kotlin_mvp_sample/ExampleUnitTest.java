package com.ykim.kotlin_mvp_sample;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        int[] a = PrimeNumber.generatePrimes(3);
        for (int anA : a) {
            System.out.println(anA);
        }
    }
}