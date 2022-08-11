//JAVA PROGRAM THAT ALLOWS US ACCESSING AN ARRAY UNTIL A VALID 
//INDEX IS GIVEN.IF MAX RETURNS EXCEED 5 PRINT ERROR.
//THROW A CUSTOM EXCEPTION OR EXCEPTION CLASS 
//IF MAX RETURNS > 5.
//PROGRAM INSIDE A METHOD THAT THROWS OUR CUSTOM EXCEPTION 
//OR EXCEPTION CLASS.
import java.util.Scanner;
class MaxRetriesExceededException extends Exception{
    public String toString(){
        return "\nMaxRetriesExceededException: "+getMessage();
    }
    public String getMessage(){
        return "You have exceeded the maximum limit of 5 attempts to access the array.";
    }
}
public class Main
{   
    static void accessArray()throws MaxRetriesExceededException{
         // declaration
         int index,c = 1;
         String [] vegetables = {"Potato","Garlic","Ginger","Tomato","Onion"};
         boolean isIndexValid;
         do {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter an index number - ");
             index = sc.nextInt();
             try{
                 System.out.print("Element at index "+index+" - "+vegetables[index]);
                 isIndexValid = true;
                 sc.close();
             }
             catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid Index.\n\tTry again");
                 isIndexValid = false;
             }
             if (isIndexValid==true)
                 break;
             else if(c==5){
                sc.close();
                 throw new MaxRetriesExceededException();
             }
            c++;
 
         }while(c<=5);
    }
	public static void main(String[] args){
	    try{
            accessArray();
        }
        catch(MaxRetriesExceededException m){
            m.printStackTrace();
        }
}
}
/*
OUTPUT->
Enter an index number - 5
Invalid Index.
	Try again
Enter an index number - 7
Invalid Index.
	Try again
Enter an index number - 99
Invalid Index.
	Try again
Enter an index number - 90
Invalid Index.
	Try again
Enter an index number - 78
Invalid Index.
	Try again

MaxRetriesExceededException: You have exceeded the maximum limit of 5 attempts to access the array.
	at Main.accessArray(Main.java:40)
	at Main.main(Main.java:48)
*/
