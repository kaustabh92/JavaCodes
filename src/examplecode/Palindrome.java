package examplecode;

public class Palindrome {

    public static void main(String[] args) {
        int[] numbers = new int[]{121,-121,12321,10};
        for(int num : numbers){
            System.out.println("Original: "+num+": is reverese? "+isPalindrome(num));
        }
    }

    public static boolean isPalindrome(int num){
        if(num < 0){
            return false;
        }
        int original = num, reversed = 0;
        while(num > 0){
            int digit = num%10;
            reversed = reversed*10 + digit;
            num = num/10;
        }
        return original == reversed;
    }
}
