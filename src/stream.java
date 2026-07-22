import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
     /*   List<Integer> li = Arrays.asList(34,56,75,33,87);

        li.stream()
                .filter(n->n>30)
                .map(n ->n*2)
                .sorted()
                .forEach(System.out::println);

//        Stream<String> stram1=li.stream();

        List<String> lis= Arrays.asList("Arun","kumar","siva","kumar","sindo");

        Set<String> unique=lis.stream().collect(Collectors.toSet());

        System.out.println(unique);

        long count=lis.stream().filter(n->n.startsWith("s")).count();
        System.out.println("  count "+count);

        Stream<Integer> stram3=Stream.of(1,4,5,6,6,7);

        Stream<Integer> stram4=Stream.iterate(1,n -> n+1).limit(5);
*/
//        System.out.println(stram1);
//        System.out.println(stram2);
//        System.out.println(stram3);
//        stram4.forEach(System.out::println);

        /*List num = Arrays.asList(1,2,3,4,5,6,7,8,9);

        num.parallelStream().forEach(n-> System.out.println(n+" "+ Thread.currentThread().getName()));
        */
//        Stream.iterate(1,n->n+1).limit(5).forEach(System.out::println);
        IntStream.range(1,7).forEach(System.out::println);
    }
}
