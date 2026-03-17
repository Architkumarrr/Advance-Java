import java.util.Arrays;
import java.util.List;

public class FilterStrings {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Python", "C", "React", "c#", "Next.js", "Node js");

        list.stream()
            .filter(str -> str.length() > 4)
            .forEach(System.out::println);
    } 
}
