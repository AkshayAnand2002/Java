package javapackage.it;
public class one1{
    public static void main(String[] args){
        System.out.println("I AM THE MAIN METHOD FROM ONE1.");
    }
}
//javac one1.java //create one1 class.
//javac -d . one1.java //creates a package folder.i.e one1.class
//javac -d .*.java //creates package folder for .java files in folder.
//THE ABOVE CODE MAKES one1.class in 'it' folder or subpackage of javapackage package
//IF THE FOLDER javapackage is not present THEN THIS PROGRAM MAKES
//IT THEN MAKES IT FOLDER AND IN THAT one1.class FOLDER IS PRESENT.
