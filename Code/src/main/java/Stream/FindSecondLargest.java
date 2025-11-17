package Stream;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargest {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,4,5,6,7};
        System.out.println("value is "+
                Arrays.stream(array)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .get()
        );
    }
}
