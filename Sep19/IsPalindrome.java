public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        int n = s.length();
        int i=0, j=n-1;

        while(i<j){
            if(s.charAt(i) - 'a' >= 0 && s.charAt(i) - 'a' < 26){
                if(s.charAt(j) - 'A' >= 0 && s.charAt(j) - 'A' < 26){
                    return false;
                }
                else if(s.charAt(j) - 'a' >= 0 && s.charAt(j) - 'a' < 26){
                    if(s.charAt(i) != s.charAt(j)){
                        return false;
                    }
                    i++;
                    j--;
                    continue;
                }
                else {
                    j--;
                    continue;
                }
            } else if(s.charAt(i) - 'A' >= 0 && s.charAt(i) - 'A' < 26){
                if(s.charAt(j) - 'a' >= 0 && s.charAt(j) - 'a' < 26){
                    return false;
                } else if(s.charAt(j) - 'A' >= 0 && s.charAt(j) - 'A' < 26){
                    if(s.charAt(i) != s.charAt(j)){
                        return false;
                    }
                    i++;
                    j--;
                    continue;
                } else {
                    j--;
                    continue;
                }
            } else {
                i++;
                continue;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
