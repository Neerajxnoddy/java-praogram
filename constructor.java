class rectangle1{
    float length;
    float width;
    rectangle1(float l, float w){
        length=l;
        width=w;
    }
    rectangle1(float l){
        length=width=l;
    }
    float area(){
        return length*width;
    }
    float perimeter(){
        return 2*(length+width);
    }
}
class constructor {
    public static void main(String[] arg){
        rectangle1 r1=new rectangle1(2.05f,3.05f);
        rectangle1 r2=new rectangle1(50.525f);
        System.out.println("Area1="+r1.area());
        System.out.println("Area2="+r2.area());
        System.out.println("Perimeter1="+r1.perimeter());
        System.out.println("Perimeter2="+r2.perimeter());
    }
}
