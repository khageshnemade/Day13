import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
        Stream<Integer> s1 = list.stream();
        Optional<Integer> s=s1.min((n1, n2) -> (n1 - n2));
        System.out.println(s);
       
    }
}
