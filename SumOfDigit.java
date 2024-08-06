import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        int sumEven=0, sumOdd=0;
        n=Math.abs(n);
        while (n>0){
            while (n > 0) {
                int digit = n % 10; // Extract the last digit
                n /= 10; // Remove the last digit

                // Add to the appropriate sum based on whether the digit is even or odd
                if (digit % 2 == 0) {
                    sumEven += digit;
                } else {
                    sumOdd += digit;
                }
            }
        }
        System.out.println("Sum of even digits: " + sumEven);
        System.out.println("Sum of odd digits: " + sumOdd);

        sc.close();
    }

}
