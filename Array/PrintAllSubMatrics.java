import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Input matrix elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Generate and print all submatrices
        generateSubMatrices(matrix);
    }

    private static void generateSubMatrices(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < cols; j++) {
                
                for (int k = i; k < rows; k++) {
                    
                    for (int l = j; l < cols; l++) {
                        
                        disply(i,j,k,l,matrix);
                        System.out.println();
                    }
                }
            }
        }
    }
    
    public static void disply(int i,int j,int k,int l,int [][] matrix){
        
        for (int m = i; m <= k; m++) {
                            
            for (int n = j; n <= l; n++) {
                System.out.print(matrix[m][n] + " ");
            }
            System.out.println();
        }
    }
}
