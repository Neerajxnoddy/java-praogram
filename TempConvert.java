import java.util.Scanner;

class TempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first temperature in Fahrenheit=");
        double s = sc.nextDouble();
        System.out.println("Enter the end temperature in Fahrenheit=");
        double e = sc.nextDouble();
        System.out.println("Enter the Step Size temperature=");
        double w = sc.nextDouble();
        for (double i=s; i<=e; i+=w) {
            double celsius1 =(5*( i-32))/9;
            System.out.println("your Fahrenheit temperature "+i+" in celsius="+celsius1);
        }
    }

}
