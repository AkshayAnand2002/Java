//REMOVE WHITESPACES FROM STRING.
import java.util.*;  
public class Main   
{  
    public static void main(String args[])   
    {   
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }   
}  
/*
replaceAll() method to remove and replace all whitespaces 
in the string sentence.
regular expression \\s that finds all white space characters
(tabs, spaces, new line character, etc.) in the string. Then, 
we replace it with "" (empty string literal).
*/
