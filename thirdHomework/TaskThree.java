package equinox;

import java.util.Arrays;

public class TaskThree {
    public void sortingArray() {
        System.out.println("Third exercise:");
        int[] firstSmallArray, secondSmallArray;
        firstSmallArray = Arrays.copyOfRange(arrayInput.bigArray, 0, 5);
        secondSmallArray = Arrays.copyOfRange(arrayInput.bigArray, 5, 10);
        Arrays.sort(firstSmallArray);
        Arrays.sort(secondSmallArray);
        String firstSmallArrayString = Arrays.toString(firstSmallArray);
        String secondSmallArrayString = Arrays.toString(secondSmallArray);
        System.out.println(firstSmallArrayString);
        System.out.println(secondSmallArrayString);
    }
}
