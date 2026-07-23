/*
@FunctionalInterface
interface inter{
    int add(int a, int b);
}
*/

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class functional_interface {
    public static void main(String[] args) {
      /*  inter in=(a,b) -> a+b ;
        System.out.println(in.add(3,4));*/
        Predicate<Integer> isEven =n->n%2==0;
        System.out.println(isEven.test(34));
        System.out.println(isEven.test(35));

        Consumer<String> message=n-> System.out.println("welcome "+n);
        message.accept("arun");

        Supplier<String> sup=()-> "hi hello";
        System.out.println(sup.get());

        Function<String ,Integer> len= string->string.length();
        System.out.println(len.apply("Arunkumar"));






    }
}
