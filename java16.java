import java.util.Scanner;
public class java16 {
    public static void main(String[] args) {
        int age;
        System.out.println("ENTER YOUR AGE: ");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("YOUR ARE 18 YEARS OLD.");
                break;
            case 23:
                System.out.println("YOU ARE 23 YEARS OLD.");
                break;
            case 60:
                System.out.println("YOU ARE 60 YEARS OLD.");
                break;
            default:
                System.out.println("YOU CAN CALCULATE YOUR AGE YOURSELF.");
        }
    }
}
