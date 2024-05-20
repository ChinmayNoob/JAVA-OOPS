public class prac9c {
    
}
public class Main {

    public static <T extends Comparable<T>> T findMinElement(T[][] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0][0];
        for (T[] row : array) {
            for (T element : row) {
                if (min.compareTo(element) > 0) {
                    min = element;
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Integer[][] intArray = {{3, 7, 2}, {5, 1, 9}, {4, 6, 8}};
        Double[][] doubleArray = {{2.3, 4.5, 1.2}, {5.6, 0.8, 3.1}, {2.7, 3.8, 1.9}};

        System.out.println("Minimum element in Integer array: " + findMinElement(intArray));
        System.out.println("Minimum element in Double array: " + findMinElement(doubleArray));
    }
}