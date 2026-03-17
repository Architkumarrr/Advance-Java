import java.util.Arrays;
import java.util.List;

public class RemoveNulls {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", null, "spring", null, "react");

        list.stream()
            .filter(str -> str != null)  
            .forEach(System.out::println);
    }
}