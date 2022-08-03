
/*
Result = byte + short -> integer
Result = short + integer -> integer
Result = long + float -> float
        Result = integer + float -> float
        Result = character + integer -> integer
Result = character + short -> integer
Result = long + double -> double
Result = float + double -> double
*/
//Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
//Use comparison operators to find out whether a given number is greater than the user entered number or not.

public class java9 {
  public static void main(String[] args) {
    char grade='B';
    char grade1=(char)(grade+8);
    //FROM ABOVE WE CAN SEE THAT (grade+8) will be an integer but grade initially was character so we typecasted
    //it as character.
    System.out.println(grade1);
    //DECRYPTING THE GRADE NOW.
    char grade2= (char) (grade1-8);
    System.out.println(grade2);
    }
}
