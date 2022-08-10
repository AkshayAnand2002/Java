//CREATING THREAD BY IMPLEMENTING RUNNABLE INTERFACE.
//start() METHOD CAN'T BE DIRECTLY IMPLEMENTED ON RUNNABLE INTERFACE.
class mythreadrunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<4000) {
            System.out.println("THREAD 1 IS RUNNING.");
            i++;
        }
    }
}
class mythreadrunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("THREAD 2 IS RUNNING.");
            i++;
        }
    }
}
public class thread2 {
    public static void main(String[] args) {
        mythreadrunnable1 bullet1 = new mythreadrunnable1();
        Thread gun1 = new Thread(bullet1);
        //ABOVE 2 LINES RUNS MYTHREADRUNNABLE1() CLASS.
        mythreadrunnable2 bullet2 = new mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);
        //ABOVE 2 LINES RUNS MYTHREADRUNNABLE2() CLASS.
        gun1.start();
        gun2.start();
        //mythreadrunnable1() runs for sometime then mythreadrunnable2()
        //runs for sometime and so on.
        //ABOVE WE USE HAVE USED GUN-BULLET ANALOGY TO REMEMBER THE FACT THAT
        //RUNNABLE METHOD CLASS IS IMPLEMENTED THEN THREAD METHOD IS CALLED
        //KEEPING ARGUEMENT AS THE OBJECT OF RUNNABLE CLASS MADE ABOVE.
        //TO RUN THE PROGRAM THREAD OBJECT IS CALLED WITH THE FUNCTIONS.
        //HERE, START FUNCTION IS CALLED WITH THREAD OBJECT.
    }
}
/* OUTPUT-> CONTINUOUSLY THREAD 1 RUNS FOR SOMETIME THEN
        * THREAD 2 RUNS FOR SOMETIME . THIS PROCESS CONTINUES.
        * SO THIS SHOWS THREAD UNDERGOES CONCURRENT EXECUTION
        * OF PROGRAM.
        * */
