package javapackage.it2;
public class two2{
    public static void main(String[] args){
        System.out.println("I AM THE MAIN METHOD FROM TWO2.");
    }
}
//javac two2.java //create two2 class.
//javac -d . two2.java //creates a package folder.i.e two2.class
//javac -d .*.java //creates package folder for .java files in folder.
//THE ABOVE CODE MAKES two2.class in 'it2' folder or subpackage of javapackage package
//IF THE FOLDER javapackage is not present THEN THIS PROGRAM MAKES
//IT THEN MAKES IT2 FOLDER AND IN THAT two2.class FOLDER IS PRESENT.
