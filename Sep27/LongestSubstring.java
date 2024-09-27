package Sep27;

import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Length of the longest substring: " + lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
