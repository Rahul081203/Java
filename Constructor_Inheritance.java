class Base{
    Base(){
        System.out.println("I am the base class default constructor.."); // Runs by default when class object is initialized
    }
    Base(int x){
        System.out.println("I am the base class parameterised constructor, x: "+x); // Can be run using the super keyword in Derived class or by passing parameters from the object initialization.
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("I am the derived class default constructor.");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("I am the derived class parameterized constructor with y: "+y);
    }
}

public class Constructor_Inheritance {
    public static void main(String[] args) {
        Derived d=new Derived();//Without passing arguments, default constructor...
        Derived d1=new Derived(5,3); // Parameterized constructor..

    }
}
