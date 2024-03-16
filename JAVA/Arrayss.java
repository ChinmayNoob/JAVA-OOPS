package JAVA;
import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[3] = 5;
        numbers[2] = 10;
        numbers[4] = 50;
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println("");

        System.out.println(Arrays.toString(numbers));

        int[] arr = {1, 200, 32, 10, 51, 6};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);

        // Multi-dimensional arrays
        int[][] matrix = new int[2][3];
        matrix[0][0]=1;
        System.out.println(Arrays.deepToString(matrix));

        // [[1, 0, 0], [0, 0, 0]]

        int [][] matrix1 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(matrix1));
        
    }
}
