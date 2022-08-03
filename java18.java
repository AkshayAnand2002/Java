import java.util.Scanner;
public class java18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR INCOME IN LAKS PER ANNUM: ");
        float tax=0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax=tax+0;
        }
        else if(income>2.5f && income<=5f){
            tax=tax+0.05f*(income-2.5f);//5% TAX B/W 2.5 TO 5
        }
        else if(income>5f && income<=10.0f){//20% TAX B/W 5 TO 10
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5.0f);
            //AS THE PERSON EARNING B/W 5 AND 10 (LAKHS ASSUMED) HAS TO 1ST PAY TAXES FOR 2.5 TO 5 THEN
            //DEPENDING ON HOW MUCH THEY EARN MORE THAN 5 THEY HAVE TO PAY TAX.
        }
        else if(income>10.0f){//30% TAX FOR > 10
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10.0f-5.0f);
            tax=tax+0.3f*(income-10.0f);
            //IF A PERSON IS EARNING > 10 THEY NEED TO FIRST PAY TAX FOR 2.5 TO 5 THEN FOR 5 TO 10
            //THEN DEPENDING ON HOW MUCH THEY EARN > 10 THEY NEED TO PAY THE TAX.
        }
        System.out.println("THE TOTAL TAX PAID BY THE EMPLOYEE: "+tax);
    }
}
