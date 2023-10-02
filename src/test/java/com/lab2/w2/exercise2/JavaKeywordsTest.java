package com.lab2.w2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JavaKeywordsTest {

    @Test
    void isJavaKeyword() {

        String sentence = "I love to do the labs with group 5";
        String word = "do";
        String res = "";
        boolean result = false;

        String []s = sentence.split(" ");

        for ( String temp : s){
            if (temp.compareTo(word) == 0)
            {
                res = temp;
                result = true;
            }else{
//                res = word + " Not Found";
                result = false;
            }

        }


        Assertions.assertEquals(word , res);

    }
}