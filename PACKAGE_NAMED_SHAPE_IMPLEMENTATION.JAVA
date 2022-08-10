//CREATE A PACKAGE NAME code.shape
//THIS PACKAGE SHOULD HAVE INDIVIDUAL CLASSES FOR RECTANGLE,
//SQUARE,CIRCLE,CYLINDER,SPHERE. THESE CLASS SHOULD USE INHERITANCE.
//ALSO INCLUDE METHODS LILKE VOLUME,SURFACE AREA AND 
//GETTERS/SETTERS FOR DIMENSIONS.
package code.shape;
// Rectangle 
class  Rectangle{
    int x;
    int y;
    // setter
    public void setl(int length) {
        this.x = length;
    }
    public void setb(int breadth){
        this.y = breadth;
    }

}
// Inheritance of Rectangle
class calcrectangle extends Rectangle{
    // getter
    public int getarea(){
        int area = x*y;
        return area;
    }
}


// square ! 
class  square{
    int a;
    // setter
    public void sets(int side) {
        this.a = side;
    }
    
}
// Inheritance of square
class calcsquare extends square{
    // getter
    
    /*
    public int getvol(){
        int volume = a*a*a;
        return volume;
    }
    */

    public int getarea(){
        int area = a*a;
        return area;
    }
}


// Circle ! 
class circle{
    int r;
    float pi = 3.14f;
    // setter
    public void setr(int radius) {
        this.r = radius;
    }
}
// Inheritance of circle
class calccircle extends circle{
    // getter
    public float getarea() {
        float area = pi*(r*r);
        return area;
    }
}


// Cylinder
class cylinder{
    int r;
    int h;
    float pi = 3.14f;
    // setter
    public void setr(int radius) {
        this.r = radius;
    }
    public void seth(int height) {
        this.h = height;
    }
}
// Inheritance of cylinder
class calccylinder  extends cylinder{
    // getter
    public float getarea() {
        float area = (2*pi*r*h) + 2*pi*(r*r);
        return area;
    }
    public float getvolume() {
        float volume = pi*(r*r)*h;
        return volume;
    }
}


// Sphere !
class sphere{
    int r;
    float pi = 3.14f;
    // setter
    public void setr(int radius) {
        this.r = radius;
    }
}
// Inheritance of sphere
class calcsphere  extends sphere{
    // getter
    public float getarea() {
        float area = 4*pi*(r*r);
        return area;
    }
    public float getvolume() {
        float volume = (4*pi*(r*r*r))/3;
        return volume;
    }
}


public class packagequestion {
    public static void main(String[] args) {
        // Rectangle !
        calcrectangle r = new calcrectangle();
        r.setl(2);
        r.setb(4);
        System.out.println("Length of rectangle : " + r.x);
        System.out.println("Breadth of rectangle : " + r.y);
        System.out.println("Area of rectangle : " + r.getarea());

        // Square !
        calcsquare s = new calcsquare();
        s.sets(2);
        System.out.println("Sides of Square : " + s.a);
        System.out.println("Area of Square : " + s.getarea());
        
        // Circle !
        calccircle c = new calccircle();
        c.setr(2);
        System.out.println("Radius of square : " + c.r);
        System.out.println("PI : " + c.pi);
        System.out.println("Area of Circle : " + c.getarea());
        
        // Cylinder !
        calccylinder cl = new calccylinder();
        cl.setr(2);
        cl.seth(4);
        System.out.println("Radius of cylinder : " + cl.r);
        System.out.println("PI : " + c.pi);
        System.out.println("Height of Cylinder : " + cl.h);
        System.out.println("Area of cylinder : " + cl.getarea());
        System.out.println("Volume of cylinder : " + cl.getvolume());
        
        // Sphere !
        calcsphere sph = new calcsphere();
        sph.setr(2);
        System.out.println("Radius of sphere : " + sph.r);
        System.out.println("PI : " + c.pi);
        System.out.println("Area of sphere : " + sph.getarea());
        System.out.println("Volume of sphere : " + sph.getvolume());
    }
}
//WE CAN GET OUTPUT BY java code/shape/packagequestion
/*
 OUTPUT->
Length of rectangle : 2
Breadth of rectangle : 4
Area of rectangle : 8
Sides of Square : 2
Area of Square : 4
Radius of square : 2
PI : 3.14
Area of Circle : 12.56
Radius of cylinder : 2
PI : 3.14
Height of Cylinder : 4
Area of cylinder : 75.36
Volume of cylinder : 50.24
Radius of sphere : 2
PI : 3.14
Area of sphere : 50.24
Volume of sphere : 33.493336
 */
