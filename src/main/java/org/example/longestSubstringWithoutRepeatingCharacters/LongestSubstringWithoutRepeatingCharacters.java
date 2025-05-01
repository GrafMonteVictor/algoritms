package org.example.longestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int cursor1 = 0, cursor2 = 0, max = 0;
        Set<Character> listTemp = new HashSet<>();
        if (s.length() == 0) {
            return 0;
        }
        while (cursor2 < s.length()) {
            if (!listTemp.contains(s.charAt(cursor2))) {
                listTemp.add(s.charAt(cursor2));
                cursor2++;
            } else {
                max = Math.max(max, listTemp.size());
                listTemp.remove(s.charAt(cursor1++));
            }
        }
        return Math.max(max, listTemp.size());
    }
}
