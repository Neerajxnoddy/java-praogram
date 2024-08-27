class E{
    String name="ram";
}
class F extends E{
    Long roll=221001160025L;
}
class G extends E{
    Long id= 5646545646L;
}
class inheritance_hierarhical {
    public static void main(String []args){
        G g=new G();
        System.out.println("name="+g.name);
    }
}

