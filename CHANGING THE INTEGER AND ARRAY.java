public class java37 {
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0]=98;
    }
    static void tell(){
        System.out.println("I INVENTED A NEW WORD!\n"+"PLAGIARISM!");
    }
    public static void main(String[] args) {
        //tell();
        //CHANGING THE INTEGER.
        //int x=45;
        //change(x);
        //System.out.println("THE VALUE OF X AFTER RUNNING CHANGE IS : "+x);//VALUE OF X IS NOT CHANGED AND IS 45.
        //CHANGING THE ARRAY.
        int [] marks={12,73,77,89,98,94};
        change2(marks);
        System.out.println("THE VALUE OF marks[0] AFTER RUNNING CHANGE2 IS : "+marks[0]);
        //Change function will update the value of arr at index 0 because when we pass array to function/method
        // it will actually pass the address of the value , therefore it is call by reference and it
        // will definitely change the value of array at index 0 and print 98
    }
}
