class dog_name{
    String name="bruno";

}
class dog_dis extends dog_name{
    String colour="black";
    int age=10;
    double height=20.5252;
}
class inheritance_single {
    public static void main(String []args){
        dog_dis d=new dog_dis();
        System.out.println("Name="+d.name);
        System.out.println("Color="+d.colour);
        System.out.println("Age="+d.age);
        System.out.println("Height="+d.height);
    }
}
