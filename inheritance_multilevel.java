class A{
    double salary=54343;
}
class B extends A{
    String employee_position="Manager";
}
class C extends B{
    String name="Rohan";
    int age=22;
    String gender="Male";
}
class inheritance_multilevel {
    public static void main(String[] args) {
        C c=new C();
        System.out.println("Name="+c.name);
        System.out.println("Age="+c.age);
        System.out.println("Gender="+c.gender);
        System.out.println("Position="+c.employee_position);
        System.out.println("Salary="+c.salary);
    }

}
