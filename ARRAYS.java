public class java28 {
    public static void main(String[] args) {
        //int [] marks = new int[5];//this is declaraation and memory allocation.
        //int [] marks;
        //marks = new int[5];
        //the above 2 lines are declaration and then memory allocation.
        //below is initialization
//        marks[0]=100;
//        marks[1]=60;
//        marks[2]=70;
//        marks[3]=90;
//        marks[4]=86;
//        int [] marks = {100,60,70,90,86};//this is declaration,memory allocation and initialization.
        //System.out.println(marks[4]);
//        System.out.println(marks.length);
//        String [] students={"abc","def","ghi","jkl","mno","pqr"};
//        System.out.println(students.length);
//        System.out.println(students[2]);
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        for(int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
//        for(int element: marks){
//            System.out.println(element);
        //this is for each loop.
    //2D ARRAYS
    int [][] flats;
    flats = new int [2][3];
    flats[0][0]=101;
    flats[0][1]=102;
    flats[0][2]=103;
    flats[1][0]=201;
    flats[1][1]=202;
    flats[1][2]=203;
    //Printing 2D ARRAY.
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);//printing (i,j)th element of matrix.
                System.out.print(" ");//for space between elements.
            }
            System.out.println("");//for moving to newline.
    }}
}
