package org.example.codility;

import java.util.HashMap;

public class S2 {

    public static void main(String[] args) {

    }


    // return string true if num is a prime number, otherwise return false
    public static String solution(int num) {

        if (num < 2) {
            return "false";
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "false";
            }
        }

        return "true";



    }

}
