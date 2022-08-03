//MAXIMUM AND MINIMUM ELEMENTS IN ARRAY.
public class java33 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,-6};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        for(int a:arr){
            if(min>a){
                min=a;
            }
        }
        System.out.println("THE MAXIMUM ELEMENT OF ARRAY: "+max);
        System.out.println("THE MINIMUM ELEMENT OF ARRAY: "+min);
    }
}
