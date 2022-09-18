
public class FunctionOverloading {
    // Function overloading is defined as the procedure of overloading a function again and again with same name and different parameters.
    // Using of a function name more than once but with different parameters is known as function overloading.
    static int foo() // First declaration of the function foo()
    {
        System.out.println("Hello World..");
        return 0;
    }
    static int foo(int x) // Second declaration of the function foo with one parameter.
    {
        System.out.println("Hello World "+x);
        return 0;
    }
    static int foo(int x,int y) // Third declaration of the function foo() with 2 parameters.
    {
        System.out.println(x+" Good Morning "+y);
        return 0;
    }
    public static void main(String[] args) {
        foo();
        foo(100);
        foo(100,200);
    }
}
