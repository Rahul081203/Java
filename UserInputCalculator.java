package Java;
import java.util.Scanner; //Importing the Scanner class for java to take user input
public class UserInputCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // Creating an object of the class Scanner to take keyboard input
        System.out.println("Enter number 1: ");
        float num1=sc.nextFloat();  // User input 1
        System.out.println("Enter number 2: ");
        float num2=sc.nextFloat();  // User input 2
        
        float sum=num1+num2; // Add the inputs
        System.out.println("Sum is: "+sum);
        

        // To validate the user input data type, we use sc.hasNextInt()/hasNextFloat() etc. which return boolean data (True/False)
    }
    
}
