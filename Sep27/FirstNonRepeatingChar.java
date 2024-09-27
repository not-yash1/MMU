package Sep27;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static char findFirstNonRepeating(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        return '_'; // Indicates no non-repeating character
    }

    public static void main(String[] args) {
        System.out.println("First non-repeating character: " + findFirstNonRepeating("swiss")); // w
    }
}

