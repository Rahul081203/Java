class Base{
    int a;
    public void hello(){
        System.out.println("Hello World....");
    }
}
class Child extends Base{
    int b;
    @Override // Override keyword can be added to show that function overriding has taken place.
    public void hello(){ // Redefining the inherited function and overriding its previous declaration
        System.out.println("You are in class Child...");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("Base Class:");
        Base b=new Base();
        b.hello();
        System.out.println("Child Class: ");
        Child c=new Child();
        c.hello();
           
    }
}
