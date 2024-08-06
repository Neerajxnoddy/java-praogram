import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table: ");
        int n = sc.nextInt();
        System.out.println("The multiplication of " + n + " is ");
        for (int i = 1; i <= 10; i++) {
            int rs=n*i;

            System.out.println(n+" * "+ i +" = "+ rs);
        }
    }
}
