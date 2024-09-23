public class CheckIfTwoStringsAreEqual {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(checkIfTwoStringsAreEqual(s1, s2));
    }

    public static boolean checkIfTwoStringsAreEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfsAreEqual(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int i=0, j=0;
        while(i<n1 && j<n2){
            if(s1.charAt(i) - 'a' >= 0 && s1.charAt(i) - 'a' < 26){
                if(s2.charAt(j) - 'a' >= 0 && s2.charAt(j) - 'a' < 26){
                    if(s1.charAt(i) != s2.charAt(j)){
                        return false;
                    }
                    i++;
                    j++;
                    // continue;
                }
                else if(s2.charAt(j) - 'A' >= 0 && s2.charAt(j) - 'Z' < 26){
                    if(s1.charAt(i) != s2.charAt(j) + 32){
                        return false;
                    }
                    i++;
                    j++;
                    // continue;
                }
                else {
                    j++;
                    // continue;
                }
            } else if(s1.charAt(i) - 'A' >= 0 && s1.charAt(i) - 'A' < 26){
                if(s2.charAt(j) - 'a' >= 0 && s2.charAt(j) - 'a' < 26){
                    if(s1.charAt(i) != s2.charAt(j) + 32){
                        return false;
                    }
                    i++;
                    j++;
                    // continue;
                }
                else if(s2.charAt(j) - 'A' >= 0 && s2.charAt(j) - 'A' < 26){
                    if(s1.charAt(i) != s2.charAt(j)){
                        return false;
                    }
                    i++;
                    j++;
                    // continue;
                }
                else {
                    j++;
                    // continue;
                }
            } else {
                i++;
                // continue;
            }
        }
        return true;
    }
}
