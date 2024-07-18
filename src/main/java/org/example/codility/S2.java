package org.example.codility;

import java.util.HashMap;

public class S2 {

    public static void main(String[] args) {
        System.out.println(solution("Wed", 2));
        System.out.println(solution("Sat", 23));
    }

    // Days of the week are represented as three-letter strings ("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun").
    // Write a function solution that, given a string S representing the day of the week and an integer K (0 ≤ K ≤ 500), returns the day of the week that is K days later.
    // For example, given S = "Wed" and K = 2, the function should return "Fri".
    //  Given S = "Sat" and K = 23, the function should return "Mon".
    public static String solution(String s, int k) {

        // change this from an array to a map
       /* HashMap<String,Integer> map = new HashMap<>();
        days.put("Mon", 0);
        days.put("Tue", 1);
        days.put("Wed", 2);
        days.put("Thu", 3);
        days.put("Fri", 4);
        days.put("Sat", 5);
        days.put("Sun", 6);
*/
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int index = 0;

        for (String day : days) {
            if (day.equals(s)) {
                break;
            }
            index++;
        }



        return days[(index + k) % 7];
    }

}
