package org.example.longestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int cursor1 = 0, cursor2 = 0;
        List<Character> listMax = new ArrayList<>();
        List<Character> listTemp = new ArrayList<>();
        if (s.length() == 0) {
            return 0;
        }
        while (cursor2 < s.length()) {
            if (!listTemp.contains(s.charAt(cursor2))) {
                listTemp.add(s.charAt(cursor2));
                cursor2++;
            } else {
                if (listMax.size() < listTemp.size()) {
                    listMax = new ArrayList<>(listTemp);
                }
                listTemp.remove(0);
                cursor1++;
            }
        }
        return Math.max(listMax.size(), listTemp.size());
    }
}
