//CHECK IF A PARTICULAR NO. IS IN ARRAY OR NOT.
public class java30 {
    public static void main(String[] args) {
        float [] marks ={45.7f,67.8f,63.4f,99.2f,100.0f};
        float num = 45.7f;
        boolean isinarray=false;
        for(float element:marks){
            if(num==element){
                isinarray=true;
                break;
            }
        }
        if(isinarray){
            System.out.println("THE VALUE IS PRESENT IN ARRAY.");
        }
        else{
            System.out.println("THE VALUE IS NOT PRESENT IN ARRAY.");
        }
    }
}
