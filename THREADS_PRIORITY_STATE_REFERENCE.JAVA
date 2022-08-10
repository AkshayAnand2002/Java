//PRINT "GOOD MORNING" AND "WELCOME" CONTINUOUSLY
//ON THE SCREEN IN JAVA USING THREADS.
//setPriority() and getPriority() -> SET AND GET THE PRIORITY.
//getState() -> TO KNOW THE STATE OF THREAD.
//Thread.currentThread().getState() -> get reference to current thread in java
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
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());//6
        System.out.println(p2.getPriority());//9
        System.out.println(p1.getState());//NEW
        System.out.println(p2.getState());//NEW
        p1.start();
        p2.start();
        System.out.println(p1.getState());//RUNNABLE
        System.out.println(p2.getState());//RUNNABLE
        System.out.println(Thread.currentThread().getState());
        //RUNNABLE
        //TO PRINT THE STATE OF CURRENT THREAD.
    }
}
/*
OUTPUT->
6
9
NEW
NEW
RUNNABLE
RUNNABLE
RUNNABLE
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
