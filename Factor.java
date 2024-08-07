import java.util.Scanner;

class Factor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i!=1 && i!=n){
                if(n%i==0){
                    System.out.println(i);
                }else {
                    System.out.print("-1");
                    break;
                }
            }
        }
    }
}
