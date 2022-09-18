
public class Methods {
    static int sum(int x, int y) // As only static functions can be called upon by other static objects therefore to call this function in the main method, which is implicitly declared as static, we must declare this method as static also.
    {   // If for any reason, we don't declare the function as static then, each object of the class has its own copy of this function and therefore can have multiple values instead of just one.
        int z;
        z=x+y;
        return z;
    }

    int s(int x, int y) // Now the function has not been declared as static then, we must use this function as a member function of the class and it can be used via object call.
    {
        int z;
        z=x+y;
        return z;
    }
    static int changeInt(int x)
    {
        x=5;
        System.out.println("Inside the method: "+x);
        return 0;
    }
    static int changeArr(int array[])
    {
        array[0] = 8;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,7));

        Methods m1=new Methods(); // Object declaration of the parent class
        int sum1=m1.s(5,7); // Calling member function using the dot operator
        System.out.println(sum1); // When a primitive data-type is passed to a method, a copy of the data is passed into the method and any changes that are made to the data are made to that copy only unless overwritten to the actual data that was passed to the function.
        // In case of arrays the reference address is passed to the method, and any further changes are made to the address itself, and hence to the actual value that is stored in the array.
        int num=1;
        changeInt(num);
        System.out.println("Outside the method: "+num);
        int arr[]={1,2,3,4,5};
        changeArr(arr);
        System.out.println("Array element after changing the value: "+arr[0]);
    }

}
