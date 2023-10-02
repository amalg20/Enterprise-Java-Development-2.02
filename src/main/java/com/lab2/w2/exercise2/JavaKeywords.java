package com.lab2.w2.exercise2;

public class JavaKeywords {
    private String str;

    private String word;


    public JavaKeywords(String str, String word) {
        this.str = str;
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public boolean isJavaKeyword(){
        return false;
    }
}
