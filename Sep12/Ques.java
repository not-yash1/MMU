package Sep12;

import java.util.*;
public class Ques {
    public static void main(String[] args) {

        // What is the time, space complexity of following code :
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int y = 89;
            for(int j=i; j<n; j++){
                System.out.println(y);
            }
        }
    }
}
