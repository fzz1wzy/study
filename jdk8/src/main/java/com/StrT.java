package com;

import org.junit.Test;

public class StrT {

    public String str = "6";
    public void vale(String str){
        this.str = "10";
    }

    public static void main(String[] args) {
        StrT strT = new StrT();
        String s = strT.str;
        strT.vale(s);
        System.out.println(s);
        System.out.println(strT.str);
    }

    @Test
    public void f1(){
        String s = "sdf";
        System.out.println();
    }
}
