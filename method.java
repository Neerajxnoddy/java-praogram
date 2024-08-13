import java.util.Scanner;

class inputs{
    double radius;
    void getdata(double r){
        radius = r;
    }
    double area(){
        return Math.PI * radius * radius;
    }
    double perimeter(){
        return 2 * Math.PI * radius;
    }
}
class method {
    public static void main(String[] arg){
        inputs i = new inputs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r1 = sc.nextDouble();
        i.getdata(r1);
        System.out.println("Area="+i.area());
        System.out.println("Perimeter="+i.perimeter());
    }
}
