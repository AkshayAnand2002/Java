//CREATE PACKAGE IN CLASS WITH 3 PACKAGE LEVELS-
//folder,folderl1,folderl2
package folder.folderl1.folderl2;
class calculator1{
    public void calculate(int a,int b){
        System.out.println("RESULT OF ADDITION: "+ a+b);
    }
}
class scientific{
    public void calculate(int a,int b){
        System.out.println("SCIENTIFIC CALCULATOR");
        System.out.println("RESULT OF MULTIPLICATION OF SUM BY 2: "+ 2*(a+b));
        System.out.println("RESULT OF SINE: "+ Math.sin(a+b));
    }
}
class hybrid{
    public void calculate(int a,int b){
        System.out.println("HYBRID CALCULATOR");
        System.out.println("RESULT OF ADDITION: "+ a+b);
        System.out.println("RESULT OF MULTIPLICATION OF SUM BY 2: "+ 2*(a+b));
        System.out.println("RESULT OF SINE: "+ Math.sin(a+b));
        System.out.println("RESULT OF COSINE: "+ Math.cos(a+b));
    }
}
public class folders {
    public static void main(String[] args){
        System.out.println("#CALCULATOR"); 
}
}
//THE ABOVE METHOD LEADS TO STORAGE OF CLASSES I.E. calculator1.class,folders.class,hybrid.class,
//scientific.class in different package levels i.e. here folderl2 level
//which is present inside folderl1 level which is present inside folder package.
//folder/folderl1/folderl2
