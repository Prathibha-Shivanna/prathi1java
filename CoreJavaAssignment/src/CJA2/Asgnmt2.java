package CJA2;

public class Asgnmt2 {

	public static void main(String[] args) {
        int starting_number = 100;
        int ending_number = 999;
        for (int i = starting_number; i <= ending_number; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number!");
            } else {
                 
            }
        }
    }
 
    public static boolean isArmstrong(int n) {
        int no_of_digits = String.valueOf(n).length();
        int sum = 0;
        int value = n;
        for (int i = 1; i <= no_of_digits; i++) {
            int digit = value % 10;
            value = value / 10;
            sum = sum + (int) Math.pow(digit, no_of_digits);
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

}
