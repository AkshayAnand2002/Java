//THREAD METHODS
//SLEEP METHOD
class mynewthr1 extends  Thread{
    public void run(){
        int i=0;
        while(i<20) {
            System.out.println("mynewthr1 ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
        //t1 stopped for 455 ms using try and catch
        //statements.THEN t2 GETS EXECUTED FOR THAT TIME.
        //SO WE SEE T2 IS IN OUTPUT THEN LATER T1 OUTPUTS COME.

    }
}
class mynewthr2 extends  Thread{
    public void run(){
        int i=0;
        while(i<10) {
            System.out.println("mynewthr2 ");
            i++;
        }
    }
}
public class threadmethods {
    public static void main(String[] args) {
        mynewthr1 t1 = new mynewthr1();
        mynewthr2 t2 = new mynewthr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        //we use t1.join(); when we don't want t2
        //execution to start until t1 execution is completed.
        //Use try and except block for exception handling.
        //IN TRY BLOCK WE TRY TO RUN THE CODE IF ANY ERROR
        //OCCURS THEN CATCH BLOCK EXECUTES WHICH HANDLES
        //EXCEPTIONS.
        t2.start();
    }
}
/*
OUTPUT->
mynewthr1 
mynewthr2 
mynewthr2 
mynewthr2 
mynewthr2 
mynewthr2 
mynewthr2 
mynewthr2 
mynewthr2 
mynewthr2 
mynewthr2 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1 
mynewthr1
* */
