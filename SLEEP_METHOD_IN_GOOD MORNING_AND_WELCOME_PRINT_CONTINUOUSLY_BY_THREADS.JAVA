//PRINT "GOOD MORNING" AND "WELCOME" CONTINUOUSLY
//ON THE SCREEN IN JAVA USING THREADS.
//sleep implemented below.
class threadprint1 extends Thread{
    public void run(){
        int i=0;
        while(i<10) {
            System.out.println("GOOD MORNING");
            i++;
        }
    }
}
class threadprint2 extends Thread{
    public void run(){
        int i=0;
        while(i<20){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("WELCOME");
            i++;
        }
//        APPLIED SLEEP METHOD IN THREADPRINT2 TO DELAY
        //THE PRINTING OF WELCOME.
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
/*
OUTPUT->
GOOD MORNING
GOOD MORNING
GOOD MORNING
GOOD MORNING
GOOD MORNING
GOOD MORNING
GOOD MORNING
GOOD MORNING
GOOD MORNING
GOOD MORNING
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
WELCOME
* */
