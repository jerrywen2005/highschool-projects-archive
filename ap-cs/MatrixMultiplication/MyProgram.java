import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        int matrix [][] = {{1,2,3}, {5,6,7},{8,9,10}};
        System.out.println("Original matrix: ");
        for (int row []: matrix){
            for (int element: row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println();
        int matrix2 [][] = new int [matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix2[i][j] = matrix[i][j]*matrix[j][i];
            }
        }
        System.out.println("Multiplied matrix: ");
        for (int row []: matrix2){
            for (int element: row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}