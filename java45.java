//Write a function to find the average of a set of numbers passed as arguments.
import java.util.Scanner;
public class java45 {
    static float average(float... arr) {
        float total = 0;
        for (float e : arr) {
            total += e;
        }
        float avg = total / arr.length;
        return avg;
    }
    float average2(float... arr) {
        float total = 0;
        for (float e : arr) {
            total += e;
        }
        float avg = total / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to pass? : ");
        int a = sc.nextInt();
        float[] arr = new float[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            float el = sc.nextFloat();
            arr[i] = el;
        }
        average(arr);
        System.out.println("THE AVERAGE IS:"+average(arr));
        java45 obj=new java45();
        System.out.println("THE AVERAGE IS:"+obj.average(arr));
    }
}