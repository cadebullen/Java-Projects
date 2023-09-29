import java.util.Scanner;
import java.util.InputMismatchException;

class ReverseInteger {
    /* Given a signed 32-bit integer x, return x with its digits reversed.
       If reversing x causes the value to go outside the signed 32-bit integer range, then return 0.
    */
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
                System.out.println(rev + "is too large of an output.");
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){
                System.out.println(rev + "is too small of na output.");
            };
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

class Main{
    public static void main (String [] args){
        int input;
        int output;
         
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer you would like to reverse: ");
        
        try{
           input = scan.nextInt();
        }
        catch (InputMismatchException e){
           System.out.println("Error: Input is not a valid integer");
           return;
        }
        finally{
           scan.close();
        }

        ReverseInteger rev = new ReverseInteger();
        output = rev.reverse(input);
        System.out.println("Here is the reversed integer: " + output);
    }
}
