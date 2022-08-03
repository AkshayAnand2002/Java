public class java14 {
    public static void main(String[] args) {
        String name ="AKSHAY ANAND";
        name=name.toLowerCase();
        System.out.println(name);//CONVERTING STRING TO LOWER CASE.
        String text="TO LOWER CASE TEXT . ";
        text=text.replace(" ","_");//REPLACE THE " " IN TEXT STRING BY UNDERSCORE.
        System.out.println(text);
        String letter = "Dear <|name|>, Thanks.";//REPLACE NAME WITH LETTER.
        letter = letter.replace("<|name|>","Akshay");
        System.out.println(letter);
        //CHECK IF THE STRING HAS DOUBLE AND TRIPLE SPACES.
        String mystring="The string has \"  \" DOUBLE SPACE and \"   \" TRIPLE SPACE.";
        System.out.println(mystring.indexOf("  "));//double space
        System.out.println(mystring.indexOf("   "));//triple space.
        System.out.println(mystring);
        String myletter="Dear CodeWithHarry,\n\tThe Java Course is nice.\n\tThanks";//USING ESCAPESEQUENCE.
        System.out.println(myletter);
    }
}
