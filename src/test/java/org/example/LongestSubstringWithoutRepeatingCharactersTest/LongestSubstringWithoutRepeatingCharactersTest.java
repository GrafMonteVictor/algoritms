package org.example.LongestSubstringWithoutRepeatingCharactersTest;

import org.example.longestSubstringWithoutRepeatingCharacters.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
    @Test
    void lengthOfLongestSubstringTest1() {
        var result = lswrc.lengthOfLongestSubstring("abcabcbb");
        Assertions.assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstringTest2() {
        var result = lswrc.lengthOfLongestSubstring("bbbbb");
        Assertions.assertEquals(1, result);
    }

    @Test
    void lengthOfLongestSubstringTest3() {
        var result = lswrc.lengthOfLongestSubstring("pwwkew");
        Assertions.assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstringTest4() {
        var result = lswrc.lengthOfLongestSubstring("p");
        Assertions.assertEquals(1, result);
    }

    @Test
    void lengthOfLongestSubstringTest5() {
        var result = lswrc.lengthOfLongestSubstring("aab");
        Assertions.assertEquals(2, result);
    }
}
