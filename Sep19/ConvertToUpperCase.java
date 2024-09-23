public class ConvertToUpperCase {

    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(convertToUpperCase(s));
        System.out.println(convertToLowerCase(s));
    }

    public static String convertToUpperCase(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                s = s.replace(s.charAt(i), (char) (s.charAt(i) - 32));
            }
        }
        return s;
    }

    public static String convertToLowerCase(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                s = s.replace(s.charAt(i), (char) (s.charAt(i) + 32));
            }
        }
        return s;
    }
}
