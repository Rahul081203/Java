
public class CustomClass {
    
    public static class MyClass // It is advised not to declare more than one class as public in java.
    {
        int id; // Attributes of class 'MyClass'
        String name;
    }
    public static void main(String[] args) {
        MyClass one= new MyClass(); // Object Instantiation of class 'MyClass' as 'one'. new keyword is used to dynamically allocate memory to the object 'one'
        one.id=12;
        one.name="Rahul";
        System.out.println(one.id+" : "+one.name);
    }
    
}