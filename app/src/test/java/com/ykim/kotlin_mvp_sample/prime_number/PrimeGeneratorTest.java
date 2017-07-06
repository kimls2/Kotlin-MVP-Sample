package com.ykim.kotlin_mvp_sample.prime_number;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ykim on 2017. 7. 6..
 */
public class PrimeGeneratorTest {
    @Test
    public void generatePrimes() throws Exception {
        System.out.println(Arrays.toString(PrimeGenerator.generatePrimes(10)));

    }

}