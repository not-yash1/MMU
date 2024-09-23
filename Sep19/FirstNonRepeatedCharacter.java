public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(firstNonRepeatedCharacter(s));
    }

    public static char firstNonRepeatedCharacter(String s) {

        int cnt[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (cnt[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
