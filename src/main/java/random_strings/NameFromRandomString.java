package random_strings;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class NameFromRandomString {

    public static String[] getArrayOfRandomStrings(int arraySize, int stringLength) {
        String[] resultArray = new String[arraySize];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = randomAlphabetic(stringLength);
            resultArray[i] = resultArray[i].substring(0,1).toUpperCase() + resultArray[i].substring(1).toLowerCase();
        }
        return resultArray;
    }

    public static void main(String[] args) {
        String[] array = getArrayOfRandomStrings(10, 10);
        for (String randomString : array) {
            System.out.println(randomString);
        }
    }


}
