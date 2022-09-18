package Java;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age=sc.nextInt();
        
        switch(age)
        {
            case 12:
                System.out.println("You are 12 yrs. old");
                break;
            case 18:
                System.out.println("You are 18 yrs. old");
                break;    
            default:
                System.out.println("No matching case found..");
        }

    }
    
}
