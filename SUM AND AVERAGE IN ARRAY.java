public class java29 {
    public static void main(String[] args) {
        float [] marks ={45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("THE VALUE OF SUM IS: "+sum);
        System.out.println("THE AVERAGE MARKS IS: "+sum/marks.length);
    }
}
