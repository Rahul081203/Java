// Defining a parent/base class

class Parent{
    private
    int x;
    public
    void setX(int num){
        x=num;
    }
    public
    int getX(){
        return x;
    }
    public void Parent(){System.out.println("This is a constructor...");} // Defining a constructor..
}
// Defining a child/derived class

class Child extends Parent{
    private
    int y;
    public
    void setY(int num){
        y=num;
    }
    int getY(){
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent p1=new Parent();
        Child c1=new Child();

        // Accessing member functions of the parent class
        p1.setX(10);
        System.out.printf("Accessing member functions of the parent class...\ngetX()=%d\n",p1.getX());

        // Accessing member functions as well as inherited functions of the child class
        c1.setX(5);
        System.out.printf("Accessing inherited function from child class...\ngetX()=%d\n",c1.getX());

        c1.setY(7);
        System.out.printf("Accessing member functions from child class...\ngetY()=%d\n",c1.getY());
        
    }
}
