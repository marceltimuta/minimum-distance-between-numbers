/*Implement a Java function that finds two neighboring numbers in an array with the
smallest distance to each other. The function should return the index of the first number.
In the sequence 4 8 6 1 2 9 4 the minimum distance is 1 (between 1 and 2).
The function should return the index 3 (of number 1). */

public class ArrayDistance {
    public static void main(String[] args) {
        int[] numberArray = {4, 8, 6, 1, 2, 9, 4};

        System.out.println("Index of the smallest distance is: " + getMinimumDistance(numberArray));
    }

    public static int getMinimumDistance(int[] array) {
        int index = 0;
        int minDistance = Math.abs(array[0] - array[1]);
        int currentDistance;

        for (int i = 1; i < array.length - 1; i++) {
            currentDistance = Math.abs(array[i] - array[i + 1]);
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                index = i;
            }
        }
        return index;
    }
}
