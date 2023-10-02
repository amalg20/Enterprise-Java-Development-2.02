package com.lab2.w2.exercise1;

import com.lab2.w2.exercise1.OddNumbers;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

class OddNumbersTest {

    @org.junit.jupiter.api.Test
    void oddNum() {
        OddNumbers num = new OddNumbers(10);
        int n = 10;
        int[] arr = new int[5];
        System.out.println("Before The test of odd number");
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                arr[j] = i;
                j++;
            }
        }
        System.out.println("After the test of odd numbers");
        System.out.println(Arrays.toString(arr));
        Assertions.assertArrayEquals(arr, new int[]{1,3,5,7,9});
    }

}