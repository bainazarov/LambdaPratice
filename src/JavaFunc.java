import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class JavaFunc {
    public static void main(String[] args) {
        // Function
        Function<Integer, Integer> func = x -> x * x;
        int result = func.apply(5);
        System.out.println(result);

        // Comparable
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Goodbye");
        list.add("ad");

        Collections.sort(list,(a,b) -> b.compareTo(a));
        System.out.println(list);

        // Supplier
        Supplier<String> supp = () -> "Hello";
        System.out.println(supp.get());

        // Consumer
        List<String> names = Arrays.asList("Tom", "Bob", "John");
        Consumer<String> printNames = name -> System.out.println(name);
        names.forEach(printNames);

        // Predicate
        Predicate<Integer> predicate = n -> n % 2 == 0;
        System.out.println(predicate.test(4));

        // BiPredicate
        Predicate<Integer> isLow = x -> x > 5;
        Predicate<Integer> isHigh = x -> x < 10;

        Predicate<Integer> isBetween = isLow.and(isHigh);
        System.out.println(isBetween.test(7));
        System.out.println(isBetween.test(4));
    }
}
