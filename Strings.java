package Java;
public class Strings {
    public static void main(String[] args) {
        String name; // In Java, String is a class and to access it we must first declare an object of the string class.
        name = new String("Rahul"); // One way to declare a string is by the use of the new operator to allocate memory dynamically to the declared string.
        System.out.println(name);

        String name1="hElLo"; // Another way to declare a string is by using the 'String' keyword as a datatype itself.
        System.out.println(name1);

        System.out.println("Upper Case: "+name1.toUpperCase());// Convert the string to uppercase
        System.out.println("Lower Case: "+name1.toLowerCase()); // Convert the string to lowercase
        System.out.println("Length: "+name1.length()); // Print the length of the string

        boolean output=name.contains("ahu"); // To check if a given substring is a part of the given string.
        System.out.println(output);

        System.out.println(name.charAt(2)); // Display the character which is at the '2' index in the given string

        System.out.println(name.endsWith("ul")); // Check if the given string ends with the passed substring.

        System.out.println(name.indexOf("hul")); // Display the index of the first element in the passed string of the substring.
        
    }
    
}
