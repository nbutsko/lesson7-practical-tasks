package random_numbers_array;

import java.util.Arrays;

public class ArrayOfRandomIntegers {

    public static int[] getArrayOfIntegers(int countOfIntegers) {
        int[] resultArray = new int[countOfIntegers];
        for (int i = 0; i < countOfIntegers; i++) {
            resultArray[i] = getRandomInteger();
        }
        return resultArray;
    }

    public static int getCountOfPositiveOddNumbersInArray(int[] array) {
        int result = 0;
        for (int number : array) {
            if (number > 0 && number % 2 != 0) {
                result++;
            }
        }
        return result;
    }

    private static int getRandomInteger() {
        return (int) (Math.random() * 200) - 100;
    }

    public static void main(String[] args) {
        int[] array = getArrayOfIntegers(100);
        System.out.println(Arrays.toString(array));
        System.out.println("Count of positive odd numbers in array: " + getCountOfPositiveOddNumbersInArray(array));
    }
}
