//PRINT "GOOD MORNING" AND "WELCOME" CONTINUOUSLY
//ON THE SCREEN IN JAVA USING THREADS.
class threadprint1 extends Thread{
    public void run(){
        while(true) {
            System.out.println("GOOD MORNING");
        }
    }
}
class threadprint2 extends Thread{
    public void run(){
        while(true){
            System.out.println("WELCOME");
        }
    }
}
public class threadproblem {
    public static void main(String[] args) {
        threadprint1 p1 = new threadprint1();
        threadprint2 p2 = new threadprint2();
        p1.start();
        p2.start();
    }
}
