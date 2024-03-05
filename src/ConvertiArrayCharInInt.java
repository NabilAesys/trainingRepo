import java.util.Arrays;

public class ConvertiArrayCharInInt {

        public static void main(String[] args) {
            String[] arr = new String[]{"2", "34", "55"};
            int[] arr2 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);
            }
        }
}
