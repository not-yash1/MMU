public class ReverseAString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        // String reversed = reverseString(str);
        String reversed2 = reverseString(str);
        // System.out.println(reversed);
        System.out.println(reversed2);
    }

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseString2(String str) {
        int n = str.length();
        
        for (int i = 0; i < n / 2; i++) {
            char temp = str.charAt(i);
            str = str.replace(str.charAt(i), str.charAt(n - 1 - i));
            str = str.replace(str.charAt(n - 1 - i), temp);
        }
        return str;
    }
}
