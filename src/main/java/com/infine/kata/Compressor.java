package com.infine.kata;

import java.util.Arrays;

public class Compressor {

    public static String compress(String in) {
        if (in == null) {
            throw new IllegalArgumentException("parmeter is null");
        }
        String result = "";
        int j = 1;
        for (int i = 0; i < in.length() - 1; i++) {
            if (in.charAt(i) == in.charAt(i + 1)) {
                j++;
            } else {
                result = result + j + in.charAt(i);
                j = 1;
            }
            if (i == in.length() - 2) {
                result = result + j + in.charAt(in.length() - 1);
            }
        }

        return result;
    }

    public static String uncompress(String in) {
        return "";
    }
}
