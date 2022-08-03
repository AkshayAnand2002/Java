//MATRIX SUM
public class java31 {
    public static void main(String[] args) {
        int [][] mat1={ {1,2,3},{4,5,6}};//matrix of 2 rows and 3 columns
        int [][] mat2={ {2,6,13},{3,7,1}};//matrix of 2 rows and 3 columns
        int [][] result={{0,0,0},{0,0,0}};
        for(int i=0;i<mat1.length;i++){//row no. of times
            for(int j=0;j<mat1[i].length;j++){//column no. of times
                //System.out.format("SETTING VALUE FOR i=%d AND j=%d\n",i,j);
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");//print new line.
        }
    }
}
