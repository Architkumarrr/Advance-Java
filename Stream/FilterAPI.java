import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(45);
        list.addAll(List.of(23,56,78,23,45,67));
        System.out.println(list);
        Stream listStream=list.stream();
       // listStream.forEach(element->System.out.println(element+ " "));
       listStream.forEach(System.out::println);

       ArrayList<String> names = new ArrayList<String>();
       names.add("apple");
       names.add("mango");
       names.forEach(System.out::println);
    }


    
}
