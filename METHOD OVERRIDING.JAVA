//METHOD OVERRIDING- IF THE CHILD CLASS IMPLEMENTS THE SAME 
//METHOD PRESENT IN THE PARENT CLASS AGAIN IT IS KNOWN AS
//METHOD OVERRIDING.
class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I AM METHOD 2 OF CLASS A.");
    }
}
class B extends A{
    public void meth2(){//OVERRIDED METHOD AS THE SAME METHOD IS
    //PRESENT IN PARENT CLASS HERE CLASS A.
        System.out.println("I AM METHOD 2 OF CLASS B.");
    }
    public void meth3(){
        System.out.println("I AM METHOD 3 OF CLASS B.");
    }
}
public class Main
{
	public static void main(String[] args) {
	   A a = new A();
	   a.meth2();
	   B b = new B();
	   b.meth2();//THIS PRINTS meth2() of class B.
}
}
/*OUTPUT-->>
I AM METHOD 2 OF CLASS A.
I AM METHOD 2 OF CLASS B.
*/
