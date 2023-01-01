package code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomer("badc", "baba"));
    }

    public static boolean isIsomer(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Character> mapStoT = new HashMap<>();
        Set<Character> usedT = new HashSet<>(); // [b,a,d,c]

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (mapStoT.containsKey(sChar)) {
                if (!mapStoT.get(sChar).equals(tChar)) {
                    return false;
                }
            } else if (usedT.contains(tChar)) {
                return false;
            } else {
                mapStoT.put(sChar, tChar);
                usedT.add(tChar);
            }
        }
        return true;
    }
}
