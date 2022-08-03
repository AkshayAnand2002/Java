class Circle {
    private int radius;
    private float area;
    private float perimeter;

    public void setradius(int r){
        radius = r;
    }
    public void checkarea(float a){  
         area=3.14f*radius*radius;
         if(area==a)
        {
            System.out.println("Correct Area.");
        }
        else{
            System.out.println("Incorrect Area.");
        }
    }
    public void checkperimeter(float p){
        perimeter = 2*3.14f*radius;
        if(perimeter==p)
        {
            System.out.println("Correct Perimeter.");
        }
        else{
            System.out.println("Incorrect Perimeter.");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    Circle ci= new Circle();
        ci.setradius(3);
        ci.checkarea(28.26f);
        ci.checkarea(58.26f);
        ci.checkperimeter(18.84f);
        ci.checkperimeter(48.84f);
}
}
