import java.util.Arrays;
import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 8, 9, 1, 5, 4, 16);

        numbers.stream()
               .filter(n -> n % 2 != 0)   
               .forEach(System.out::println);
    }
}
