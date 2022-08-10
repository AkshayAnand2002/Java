//CONSTRUCTORS FROM THREAD CLASS
class mythread extends  Thread{
    public mythread(String name){
     super(name);
     //THREAD CLASS ALREADY HAS CONSTRUCTOR THAT TAKES NAME.
     //WE ARE TAKING A THREAD CLASS CONSTRUCTOR CALLED name HENCE USED SUPER.
    }
    public void run(){
     int i=0;
     while(i<4){
      System.out.println("I AM A THREAD.");
      i++;
     }
    }
}
 public class threadconstructor {
  public static void main(String[] args) {
        mythread t = new mythread("ABCD");
        mythread t1 = new mythread("XYZ");
        t.start();
        t1.start();
        System.out.println("ID OF THREAD T IS : "+t.getId());
        //TO GET ID OF THREAD.
        //OUTPUT OF THE ABOVE LINE: ID OF THREAD T IS : 15
        System.out.println("NAME OF THREAD T IS : "+t.getName());
        //OUTPUT OF ABOVE LINE: NAME OF THREAD T IS : ABCD
        System.out.println("ID OF THREAD T IS : "+t1.getId());
        //OUTPUT OF THE ABOVE LINE: ID OF THREAD T IS : 16
        System.out.println("NAME OF THREAD T IS : "+t1.getName());
        //OUTPUT OF THE ABOVE LINE: NAME OF THREAD T IS : XYZ
  }
}
/*
* OUTPUT->
I AM A THREAD.
I AM A THREAD.
I AM A THREAD.
I AM A THREAD.
I AM A THREAD.
I AM A THREAD.
I AM A THREAD.
I AM A THREAD.
ID OF THREAD T IS : 15
NAME OF THREAD T IS : ABCD
ID OF THREAD T IS : 16
NAME OF THREAD T IS : XYZ
*/
