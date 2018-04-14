package equinox;

import java.util.Arrays;

public class TaskFourth {
    public void findingArithmetic() {
        double arithmeticMean = Arrays.stream(arrayInput.bigArray).summaryStatistics().getAverage();
        System.out.println("Fourth exercise:");
        System.out.println("Arithmetic mean is " + arithmeticMean);
    }
}
