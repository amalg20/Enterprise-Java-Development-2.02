package com.lab2.w2.exercise1;

public class OddNumbers {
    private int n;
    private int [] array;

    public OddNumbers(int n) {
        this.n = n;
        this.array = array;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int [] oddNum(){
//        int j = 0;
//        for (int i = 1; i < n; i++) {
//            if (i % 2 != 0) {
//                array[j] = i;
//                j++;
//            }
//        }
       return array;
    }
}
