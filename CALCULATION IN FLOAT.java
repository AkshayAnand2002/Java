public class java8 {
    public static void main(String[] args) {
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);
        //to calculate 7/4 * 9/2 and get the right answer we use 7/4.0f * 9/2.0f as here
        //the first term is converted to floating point which is them multiplied by 9 and then divided by 2.0
        //which is also a floating point.
        //if used 7/4 * 9/2 then it treated as division of 2 integers which will also be an integer.
        //so, 7/4 evaluates to integer 1 and 9/2 evaluates to 4 and then both multiplied to give 1*4=4 which
        //is wrong mathematically.
    }
}
