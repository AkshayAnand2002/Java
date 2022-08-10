//REMOVE WHITESPACES FROM STRING.
import java.util.*;  
public class Main   
{  
    public static void main(String args[])   
    {   
        // create an object of Scanner
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    // take the input
    String input = sc.nextLine();
    System.out.println("Original String: " + input);
    // remove white spaces
    input = input.replaceAll("\\s", "");
    System.out.println("Final String: " + input);
    sc.close();
    }   
}  
/*
replaceAll() method to remove and replace all whitespaces 
in the string sentence.
regular expression \\s that finds all white space characters
(tabs, spaces, new line character, etc.) in the string. Then, 
we replace it with "" (empty string literal).
*/
