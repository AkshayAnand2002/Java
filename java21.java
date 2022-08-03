//PROGRAM TO FIND TYPE OF WEBSITE FROM THE URL.
//.com=COMMERCIAL WEBSITE.
//.org=ORGANIZATION WEBSITE
//.in=INDIAN WEBSITE
import java.util.Scanner;
public class java21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website=sc.next();
        if(website.endsWith(".com")){
            System.out.println("THIS IS AN ORGANIZATIONAL WEBSITE.");
        }
        else if (website.endsWith(".org")){
            System.out.println("THIS IS AN ORGANIZATIONAL WEBSITE.");
        }
        else if(website.endsWith(".in")){
            System.out.println("THIS IS AN INDIAN WEBSITE.");
        }
    }
}
