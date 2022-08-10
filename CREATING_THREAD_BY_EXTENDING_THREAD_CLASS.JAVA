//CREATING THREAD BY EXTENDING THREAD CLASS-----------------
//MULTIPROCESSING AND MULTITHREADING ARE USED TO ACHIEVE
//MULTITASKING. THREADS USE SHARED MEMORY AREA.
//THREADS UNDERGO FASTER CONTEXT SWITCHING.
//A THREAD IS LIGHWEIGHTED WHEARAS A PROCESS IS HEAVY WEIGHT.
//'2' WAYS TO CREATE A THREAD IN JAVA--1)BY EXTENDING THREAD CLASS
//2)BY IMPLEMENTING RUNNABLE INTERFACE.
//THREADS ARE USED FOR LIGHT-WEIGHT AND INDEPENDENT EXECUTION.
import java.util.*;
class mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("THREAD 1 IS RUNNING.");
            i++;
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("THREAD 2 IS RUNNING.");
            i++;
        }
    }
}
public class thread {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
        //TO START A THREAD WE USE START METHOD.
        //START METHOD CALLS RUN METHOD INTERNALLY.
        //THESE ALL IMPLEMENTATIONS OCCUR IN THREAD.
    }
}
/*
* OUTPUT-> CONTINUOUSLY THREAD 1 RUNS FOR SOMETIME THEN
* THREAD 2 RUNS FOR SOMETIME . THIS PROCESS CONTINUES.
* SO THIS SHOWS THREAD UNDERGOES CONCURRENT EXECUTION
* OF PROGRAM.
* */
