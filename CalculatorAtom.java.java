import java.util.Scanner;

public class CalculatorAtom {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please type a number and I will tell you if it is even: ");
    int userNum = input.nextInt();
    // System.out.println(multiplyBy2(3));
    System.out.println("4 is even: " + isEven(4));
    System.out.println("8 is divisible by 5: " + isDivisibleBy(8,5));

  }
  // public static int multiplyBy2(int n) {
  //   return n * 2;
  // }

  /**
    * Returns true is a given number is even, false if it is not.
    **/
    public static boolean isEven(int n) {
      return (n % 2 == 0);
    }
/**
  * given 2 nums retruns true if the 1st is divisble by the 2nd
  * @param num The number to be divided
  * @param divisor the num to divide by
  * @return True is num is divisble by divisor, false otherwise
  **/

    public static boolean isDivisibleBy(int num, int divisor) {
      return (num % divisor == 0);
    }
}
