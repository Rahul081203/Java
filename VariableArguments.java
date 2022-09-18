
public class VariableArguments {
/*     static int sum(int x, int y) {
        return x + y;
    }

    
    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static int sum(int x, int y, int z, int p) {
        return x + y + z + p;
    }
     */
    // What if you have pass variable number of arguments to the method? Would you make separate methods using function overloading for each and every number of arguments that need to be passed to the function?
    // Then we use varargs(short for variable arguments).
    // These arguments make an array out of all the arguments that are passed to the method and later on can be accessed as arrays.
    // Declared by passing parameter requirement as "...<Name_of_array>"

    static int sum(int ...arr){
        int result=0;
        for (int value:arr){ // Read as: "for int value in arr"
            result+=value;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 3,5: "+ sum(3,5)); // Arguments are passed as an array of integers to the method.
        System.out.println(("Sum of 3, 4, 5: "+sum(3,4,5)));
        System.out.println("Sum of 2, 3, 4, 5: "+sum(2,3,4,5));

        System.out.println("Sum of nothing is: "+sum()); // Even if you don't pass anything, the sum will be equal to zero instead of returning any error.
        // This is the major benifit of varargs.
    }

}
