import java.util.*;
// This program implements the brute-force algorithm for multiplying two matrices...
public class Matrix_Multiplication {
    static int m, n, p;
    public static void MultiplyMatrices(float arr1[][], float arr2[][]){
        /*
         * C[i][j] = sum(A[[i][k]*B[k][j]) over all k in {0,1,2,3,...,n-1} for each i and j in {0,1,...,m-1} & {0,1,...,p-1} respectively.
         */
        float [][] arr = new float[m][p];
        int count = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < p; j++){
                arr[i][j] = 0;
                for (int k = 0; k < n; k++){
                    arr[i][j] += arr1[i][k]*arr2[k][j];
                    count += 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            // System.out.println(arr[i] + "\n");
            System.out.println("");
        }
        System.out.println("\nTotal number of multiplications: " + count);
    }
    // public static void printResult(float arr1[][], float arr2[][]){
    //     MultiplyMatrices(arr1, arr2);
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shapes of the matrices: ");
        m = sc.nextInt(); n = sc.nextInt(); p = sc.nextInt();
        float array1[][] = new float[m][n];
        float array2[][] = new float[n][p];
        System.out.println("Enter the first matrix elements: "); 
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("array1[" + i + "][" + j + "]: ");
                array1[i][j] = sc.nextFloat();
            }
            System.out.println(" ");
        }
        System.out.println("Now for the second matrix...");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < p; j++){
                System.out.print("array2[" + i + "][" + j + "]: ");
                array2[i][j] = sc.nextFloat();
            }
            System.out.println(" ");
        }
        System.out.println("The product of the two given matrices is: ");
        // printResult(array1, array2);
        MultiplyMatrices(array1, array2);
        sc.close();
    }
}
// All in all, there will be a total of mnp multiplications in this process...