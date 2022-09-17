import java.util.Scanner;
public class UserInputCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float num1=sc.nextFloat();
        System.out.println("Enter number 2: ");
        float num2=sc.nextFloat();
        
        float sum=num1+num2;
        System.out.println("Sum is: "+sum);
        
    }
    
}
