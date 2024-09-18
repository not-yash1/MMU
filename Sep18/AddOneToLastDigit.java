package Sep18;

import java.util.Arrays;

public class AddOneToLastDigit {
    public static int[] addOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits = {8, 9, 9};

        int[] result = addOne(digits);
        
        System.out.println("Result: " + Arrays.toString(result));
    }
}
