public class java35 {
    static int logic(int x,int y){//this is a method or function inside a class.
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        System.out.println(a+" "+b);
        int a1=2;
        int b1=1;
        int c1;
//        if(a1>b1){
//            c1=a1+b1;
//        }
//        else{
//            c1=(a1+b1)*5;
//        }
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(a1+" "+b1);
        System.out.println(c1);
    }
}