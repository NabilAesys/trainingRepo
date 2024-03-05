
import java.util.stream.Stream;

public class ConvertStringArrayIntoIntArray {


        public static void main(String[] args) {
            int somma = 0;
            String[] arr = new String[] {"2", "34", "55"};
            Integer[] arr2 = Stream.of(arr).mapToInt(Integer::parseInt).boxed().toArray(Integer[] ::new);
            for (int i = 0; i < arr2.length; i++) {
                 somma += arr2[i];
                System.out.println(arr2[i]);
            }
            System.out.println("somma: " + somma);
        }
}
