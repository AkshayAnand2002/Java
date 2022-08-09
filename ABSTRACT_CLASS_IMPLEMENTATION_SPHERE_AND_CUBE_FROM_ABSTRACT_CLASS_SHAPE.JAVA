//ABSTRACT CLASSES IMPLEMENTATION
//SPHERE IN PROGRAM AS CIRCLE AND CUBE DERIVED FROM ABSTRACT
//CLASS SHAPE.
abstract class Shape{
    abstract void area();
    abstract void volume();
}
class Circle extends Shape{
    float r;
    float pi = 3.14f;
    
    Circle(){
        r = 5f;
    }
    Circle(int r){
        this.r = r;
    }
    public void area(){//OVERRIDES area of Shape class.
        System.out.println("The area of Circle is: "+pi*r*r);
    }
    public void volume(){//OVERRIDES volume of Shape class.
        System.out.println("The volume of Sphere is: "+(4/3f)*pi*r*r*r);
    }
}

class Cube extends Shape{
    float l;
    Cube(){
        l = 5f;
    }
    Cube(int l){
        this.l = l;
    }
    public void area(){//OVERRIDES area of Shape class.
        System.out.println("The area of Square is: "+l*l);
    }
    public void volume(){//OVERRIDES volume of Shape class
        System.out.println("The volume of cube is: "+l*l*l);
    }
}
public class Main
{
	public static void main(String[] args) {
        Cube cu1 = new Cube(9);
        Circle c1 = new Circle(9);
		Circle c2 = new Circle();
		c2.volume();
		c1.volume();
		cu1.volume();
	}
}
/*
OUTPUT->
The volume of Sphere is: 523.3334
The volume of Sphere is: 3052.0803
The volume of cube is: 729.0
*/
