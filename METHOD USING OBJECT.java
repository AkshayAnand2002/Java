public class java36 {
    int logic(int x,int y){//this is a method or function inside a class.
        //here static is not used. So,we need to create object using class .
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
        java36 obj = new java36();
        //METHOD INVOCATION USING OBJECT CREATION.
        c=obj.logic(a,b);
        int a1=2;
        int b1=1;
        int c1;
        c1=obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
