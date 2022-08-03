//VARARGS- INSTEAD OF WRITING FUNCTIONS OR METHODS(FUNCTIONS INSIDE CLASS) WITH OVERLOADING WITH AS MANY
//ARGUEMENTS WHICH USER INPUTS WE CAN USE VARARGS WHICH WORKS FOR AS MANY ARGUEMENTS WHICH USER INPUTS.
public class java39 {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
    static int sum(int...arr){//THIS IS A VARARG AS IT CAN TAKE ANY NO. OF ARGUEMENTS.
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    static int sum1(int x,int...arr){//THIS IS A VARARG WHICH COMPULSORILY TAKES 1 INPUT AND 0 INPUT AS ARGUEMENTS IS NOT ALLOWED.
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("THE SUM OF 4 AND 5 IS: "+sum(4,5));
        System.out.println("THE SUM OF 4,5 AND 3 IS: "+sum(4,3,5));
        System.out.println("THE SUM OF 1,2,4,5 AND 3 IS: "+sum(1,2,4,3,5));
        System.out.println("THE SUM OF NOTHING IS: "+sum());
        System.out.println("THE SUM OF 4 AND 5 IS: "+sum1(4,5));
        System.out.println("THE SUM OF 4,5 AND 3 IS: "+sum1(4,3,5));
        System.out.println("THE SUM OF 1,2,4,5 AND 3 IS: "+sum1(1,2,4,3,5));
    }
}
