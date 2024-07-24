import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int[][] arr = new int[n][n]; 

        // Read the matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt(); 
            }
        }

        int primaryDiagonalSum = 0; 
        int secondaryDiagonalSum = 0; 

        // Calculate the sums of both diagonals
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr[i][i]; // Sum of the primary diagonal
            secondaryDiagonalSum += arr[i][n - i - 1]; // Sum of the secondary diagonal
        }

        // Calculate the absolute difference between the diagonal sums
        int diagonalDifference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);

        System.out.println(diagonalDifference);

        scanner.close(); 
    }
}
