import java.util.Scanner;

class Salary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allow;
        System.out.print("Enter Basic Salary: ");
        int bs = sc.nextInt();
        System.out.print("Enter grade(A/B/C) Salary: ");
        char ch = sc.next().charAt(0);
        double HRA= bs* 0.2 ;
        double DA= 0.5 *bs;
        if (ch=='A'){
             allow =1700;
        } else if (ch=='B') {
            allow = 1500;
        } else{
            allow = 1300;
        }

        double PF =0.11 * bs;

        double salary = bs + HRA + DA + allow-PF;
        System.out.println("Your Salary is: "+salary);

    }
}
