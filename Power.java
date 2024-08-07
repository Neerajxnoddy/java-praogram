import java.util.Scanner;

class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double result;
        System.out.println("Enter the power:");
        int power = sc.nextInt();
        System.out.println("enter the number:");
        float number=sc.nextFloat();
        result = Math.pow(number,power);
        System.out.println("The result is " + result);
    }
}
