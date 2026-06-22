import java.util.*;

public class twoDarray {
    public static void main(String[] args) {
        System.out.println("enter number of rows and columns:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("enter elements of array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }

            }
            System.out.println("enter the element to search:");
            int x = sc.nextInt();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (arr[i][j] == x) {
                        System.out.println("x is found at index:" + i + "," + j);
                        return;
                    }
                }
            }
            System.out.println("x is not found in the array");
        }
    }
}
