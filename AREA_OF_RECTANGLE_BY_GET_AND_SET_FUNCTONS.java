//PRINT AREA OF RECTANGLE BY SET AND GET FUNCTIONS.
public class Main
{   int length,breadth,area;
    void setdimension(int x,int y){
        length=x;
        breadth=y;
    }
    int getarea(){
        return(length*breadth);
    }
	public static void main(String[] args) {
		Main rect = new Main();
		rect.setdimension(2,3);
		System.out.println("AREA: "+rect.getarea());
	}
}
/*
class Rect 
 { 
             int l,b; 
             void setval(int x,int y) 
             { 
                         l=x; 
                         b=y; 
             } 
             int area() 
             { 
                         return (l*b); 
             } 
 }; 
 class CalculateAreaofRectangle 
 { 
              
             public static void main (String args[]) 
             { 
                         Rect rect = new Rect(); 
                         rect.setval (50,8); 
                         System.out.println("Area of Rectangle is : "+rect.area()); 
             } 
 }; 
*/
