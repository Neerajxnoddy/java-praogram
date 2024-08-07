import java.util.Scanner;

class Factor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                sum= sum + 1;
            }
        }
        if(sum == 0){
            System.out.println("-1");
        }
    }
}
