import java.util.Scanner;
public class java13 {
    public static void main(String[] args) {
        String name="AKSHAY";
        int value=name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        String nontrimmedstring = "  AKSHAY     ";
        System.out.println(nontrimmedstring);
        String trimmedstring = nontrimmedstring.trim();
        System.out.println(trimmedstring);
        //trim returns a new string after removing leading and trailing spaces from the original string.
        System.out.println(name.substring(2));//prints string with index.
        System.out.println(name.substring(1,5));//returns substring from index 1 to index 4.
        System.out.println(name.replace('A' , 'I'));//replace all occurences of oldchar with newchar in string.
        System.out.println(name.replace("KSHA" , "SHKI"));
        System.out.println(name.startsWith("AKS"));//START WITH
        System.out.println(name.endsWith("HAY"));//END WITH
        System.out.println(name.charAt(0));//CHAR AT PARTICULAR INDEX
        System.out.println(name.indexOf("H"));//INDEX OF 1ST OCCURENCE OF CHAR
        System.out.println(name.indexOf("AY"));//INDEX OF 1ST OCCURENCE OF SUBSTRING.
        System.out.println(name.indexOf("A",2));//TO FIND OUT NEW INDEX OF THE SUBSTRING WHEN INDEX STARTS FROM
        //PARTICULAR VALUE.
        System.out.println(name.lastIndexOf("A"));//get last index of char
        System.out.println(name.lastIndexOf("A",4));//get last index starting to search from a particular index.
        System.out.println(name.equals("AKSHAY"));//checks if name is same as or equals input string.
        //JAVA IS CASE-SENSITIVE SO, AKSHAY AND akshay ARE DIFFERENT.
        //.EQUALSIGNORECASE IGNORES THE CASE OF STRING AND MATCHES THE STRING.
        //SO, BY equalsIgnoreCase the strings AKSHAY, akshay, AkShaY,akSHay, etc. are same or equal.
        System.out.println(name.equalsIgnoreCase("akshay"));
        System.out.println(name.equalsIgnoreCase("aKSHay"));
        System.out.println(name.equalsIgnoreCase("AksHaY"));
        //ESCAPE SEQUENCE ARE THE SEQUENCE OF CHARACTERS AFTER BACKSLASH \.
        System.out.println("I AM ESCAPE SEQUENCE \" DOUBLE QUOTE.");//PRINT DOUBLE QUOTE.
        // \n->newline,\t->tab,\'->single quote,\"->double quote,\\->backslash etc.
    }


}
