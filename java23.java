public class java23 {
    public static void main(String[] args) {
//        int a=0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }
//        int b=0;
//        do{
//            System.out.println(b);
//            b++;
//        }while(b<5);
//        int n = 1;
//        do{
//            System.out.println(n);
//            n++;
//        }while(n<=1000);
        int n=10;
//        for(int i=0;i<n;i++){
//            System.out.println(2*i+1);
//        }
//        for(int i=n;i !=0;i--){
//            System.out.println(2*i+1);
//        }
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("JAVA");
//            if(i==2){
//                System.out.println("ENDING THE LOOP.");
//                break;//as soon as i=2 then break breaks out of loop and no further nos. are printed.
//            }
//        }
        for(int i=0;i<5;i++){
            if(i==2){
                System.out.println("ENDING THE LOOP.");
                continue;//for i=2 it stops printing the lines below continue and moves to next value of i by i++.
                //continue used to immediately to next iteration.The control is taken to next iteration thus skipping
                // everything below continue inside the loop for that iteration.
            }
            System.out.println(i);
            System.out.println("JAVA");
        }
    }
}
