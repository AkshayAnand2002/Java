import java.util.Scanner;
public class java17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte m1,m2,m3;//we can take int but marks will be <= 100 so we can take byte also.
        System.out.println("ENTER PHYSICS MARKS:");
        m1=sc.nextByte();
        System.out.println("ENTER CHEMISTRY MARKS:");
        m2=sc.nextByte();
        System.out.println("ENTER MATHS MARKS:");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("YOUR OVERALL PERCENTAGE IS: "+avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("CONGRATULATIONS!,YOU PASSED.");
        }
        else{
            System.out.println("SORRY,YOU DID NOT CLEAR CUTOFF.");
        }
    }
}
