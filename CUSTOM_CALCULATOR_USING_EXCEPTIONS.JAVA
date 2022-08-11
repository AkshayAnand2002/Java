/*
        You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidInputException extends InputMismatchException {

    public String toString() {
        return "Not a valid operation";
    }


    public String getMessage() {
        return "Pls enter a valid operation";
    }
}

class ZeroException extends ArithmeticException{

    public String toString() {
        return "Cannot divide by 0";
    }

    public String getMessage() {
        return "Enter a number other than 0";
    }
}

class MaxInputException extends InputMismatchException{

    public String toString() {
        return "Number can't exceed 100000";
    }


    public String getMessage() {
        return "Pls enter a number <= to 100000";
    }
}

class MaxMultiplierReachedException extends ArithmeticException{

    public String toString() {
        return "Cannot multiply by a number > 7000";
    }

    
    public String getMessage() {
        return "Pls enter a number <=7000";
    }
}
public class main
{
    public static void main(String[] args){
        int a,b;
        long sol;
        char op;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>100000 || b>100000)
            throw new MaxInputException();


        System.out.println("Enter the operation sign: ");
        op=sc.next().charAt(0);


        switch(op)
        {
            case '+':
                sol=a+b;
                break;

            case '-':
                sol=a-b;
                break;

            case '/':
                if(b==0)
                    throw new ZeroException();
                else
                    sol=a/b;
                break;

            case '*':
                if( a>7000 || b>7000 )
                    throw new MaxMultiplierReachedException();
                else
                    sol=a*b;
                break;

            default:
                throw new InvalidInputException();
        }

        System.out.println("The ans is: "+sol);

    }
}
/*
OUTPUT->
Enter 2 numbers:
1000000
677777
Exception in thread "main" Number can't exceed 100000
	at main.main(main.java:61)
*/
