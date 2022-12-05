package org.leetcode;

import java.util.HashMap;

public class CommonCharacters {

    public static void main(String[] args) {
        CommonCharacters c = new CommonCharacters();
        System.out.println(c.CommonCharacters("dheeraj", "neeraj")); // {d: 1, h: 1, e: 2, r: 1, a: 1, j: 1}
    }

    public String CommonCharacters(String a, String b) {

        HashMap<Character, Integer> storeCounts = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            storeCounts.merge(a.charAt(i), 1, Integer::sum);
             /*
             Deprecated Way of incrementing Map Value

            if (storeCounts.containsKey(a.charAt(i))) {
               storeCounts.put(a.charAt(i), storeCounts.get(a.charAt(i)) + 1);
            }
            storeCounts.put(a.charAt(i), 0);*/
        }

        String temp = "";

        for (int i = 0; i < b.length(); i++) {
            if (storeCounts.containsKey(b.charAt(i))) {
                storeCounts.put(a.charAt(i), storeCounts.get(a.charAt(i)) - 1);
                temp += b.charAt(i);
            }
        }
        return temp;
    }
}
