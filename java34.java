public class java34 {
    public static void main(String[] args) {
        boolean issorted=true;
        int [] arr = {1,2,3,4,5,6};
        for(int i=0;i<arr.length-1;i++){//arr.length-1 and not arr.length as we need to do comparison of pairs
            //i.e. 1,2 then 2,3 then 3,4 then 4,5 then 5,-6 but -6 there is no element so we need to
            //stop at this point and comparison till 5 and -6. i.e. total 5 elements which is (arr.length-1).
            if(arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
        }
        if(issorted){
            System.out.println("THE ARRAY IS SORTED.");
        }
        else{
            System.out.println("THE ARRAY IS NOT SORTED.");
        }
    }
}
