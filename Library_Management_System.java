//Implement a library using java.
//LIBRARY MANAGEMENT SYSTEM
//NOTE: DON'T ADD SPACE BETWEEN WORDS OF BOOK NAME INSTEAD
//USE UNDERSCORE.
import java.util.Scanner;
class Library {
    String [] availableBooks = new String[100];

    public void addBook(String a){
        for (int i=0;i<=availableBooks.length;i++){
            if (availableBooks[i]==null){
                availableBooks[i]=a;
                System.out.println("Book added successfully");
                break;
            }
        }
    }

    public void showAvailableBooks(){
        System.out.println("The Books that are available in the Library are:");
        for(int i=0;availableBooks[i]!=null;i++){
            System.out.println(i+" :- "+availableBooks[i]);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Welcome to library management system");
        System.out.println("Enter 1 for add book\nEnter 2 show Available books\nEnter 5 to exit the library management system:-");
        Scanner sc = new Scanner(System.in);

        while(true){
            int user = sc.nextInt();
            if (user==1) {
                System.out.println("Enter the book name that you want to add in the library");
                String addBk = sc.next();
                library.addBook(addBk);
            }
            else if (user==2) {
                library.showAvailableBooks();
            }
            else if (user==5){
                System.out.println("Thanks for visiting library management system");
                break;
            }
            else{
                System.out.println("Not a valid input.");
            }
        }
	}
}
