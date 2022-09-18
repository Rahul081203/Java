package Java;
public class Arrays {
    public static void main(String[] args) {
        int marks[] = {1,2,3,4,5,6,7,8,9,10}; // Declaration of an array of integers
        System.out.println(marks[0]); // Accessing individual element by the use of indices
        System.out.print("{");
        
        // Traditional/ Classical way of traversing an array
        int i=0;
        while (i < marks.length -1)
        {
            System.out.print(marks[i]+", ");
            i++;
        }
        System.out.print(marks[i]);
        System.out.println("}");

        // Java way of traversing an array
        for (int value:marks)
        {
            System.out.println(value);
        }

        //Try-Catch Block
        try{
            System.out.println(marks[10]);
        }
        catch(Exception exception){ // Stored the exception generated in the variable exception for printing later on..
            System.out.println(exception);
        }
        System.out.println("Successfully completed execution..");
    }

}
