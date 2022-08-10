//THREAD PRIORITIES
//THREAD PRIORITIES ALSO DEPEND UPON OS.
class mythr1 extends  Thread{
    public mythr1(String name){
        super(name);
        //THREAD CLASS ALREADY HAS CONSTRUCTOR THAT TAKES NAME.
        //WE ARE TAKING A THREAD CLASS CONSTRUCTOR CALLED name HENCE USED SUPER.
    }
    public void run(){
        int i=0;
        while(i<10) {
            System.out.println("THANK YOU " + this.getName());
            i++;
        }
    }
}
public class thread_priorities {
    public static void main(String[] args) {
        mythr1 t1 = new mythr1("ABCD");
        mythr1 t2 = new mythr1("EFGH");
        mythr1 t3 = new mythr1("IJKL");
        mythr1 t4 = new mythr1("MNOP");
        mythr1 t5 = new mythr1("QRST (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        //t5 is given the most priority.
        //so,t5 appears the most no. of times.
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        //ABOVE THREADS ASSIGNED MINIMUM PRIORITY
        //SO THEY APPEAR LESSER NO. OF TIMES.
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
/*
* OUTPUT->
THANK YOU QRST (most important)
THANK YOU QRST (most important)
THANK YOU QRST (most important)
THANK YOU QRST (most important)
THANK YOU QRST (most important)
THANK YOU QRST (most important)
THANK YOU QRST (most important)
THANK YOU QRST (most important)
THANK YOU ABCD
THANK YOU ABCD
THANK YOU ABCD
THANK YOU ABCD
THANK YOU ABCD
THANK YOU IJKL
THANK YOU IJKL
THANK YOU IJKL
THANK YOU IJKL
THANK YOU IJKL
THANK YOU ABCD
THANK YOU QRST (most important)
THANK YOU QRST (most important)
THANK YOU IJKL
THANK YOU IJKL
THANK YOU ABCD
THANK YOU ABCD
THANK YOU ABCD
THANK YOU ABCD
THANK YOU EFGH
THANK YOU IJKL
THANK YOU IJKL
THANK YOU IJKL
THANK YOU EFGH
THANK YOU EFGH
THANK YOU EFGH
THANK YOU EFGH
THANK YOU EFGH
THANK YOU EFGH
THANK YOU EFGH
THANK YOU EFGH
THANK YOU EFGH
THANK YOU MNOP
THANK YOU MNOP
THANK YOU MNOP
THANK YOU MNOP
THANK YOU MNOP
THANK YOU MNOP
THANK YOU MNOP
THANK YOU MNOP
THANK YOU MNOP
THANK YOU MNOP
* */
