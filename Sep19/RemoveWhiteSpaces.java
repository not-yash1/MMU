public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(removeWhiteSpaces(s));
    }

    public static String removeWhiteSpaces(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
