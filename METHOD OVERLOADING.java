//METHOD OVERLOADING
public class java38 {
    static void foo(){
        System.out.println("GOOD MORNING BRO!");
    }
    static void foo(int a){
        System.out.println("GOOD MORNING "+a+" BROs!");
    }
    static void foo(int a,int b){
        System.out.println("GOOD MORNING "+a+" BROs!");
        System.out.println("GOOD MORNING "+b+" BROs!");
    }
    public static void main(String[] args) {
        foo();
        foo(10);
        foo(123,456);
    }
}
