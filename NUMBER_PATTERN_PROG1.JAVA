import java.util.Scanner;
public class NumberPattern1 {
    public static void main(String[] args) {
        int rows, k = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(++k + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
