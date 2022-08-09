//INHERITANCE IN INTERFACES
interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsampleinterface extends sampleinterface{
//DUE TO INHERITANCE meth1() and meth2() OF SAMPLE INTERFACES
//ARE ALSO INCLUDED IN childsampleinterface.
//SO IN mysampleclass BELOW WE NEED TO WRITE ALL METHODS.
    void meth3();
    void meth4();
}
class mysampleclass implements childsampleinterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Main
{
	public static void main(String[] args) {
        mysampleclass obj = new mysampleclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
	}
}
/*
OUTPUT->
meth1
meth2
meth3
meth4
*/
