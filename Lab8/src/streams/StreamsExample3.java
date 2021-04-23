package streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample3 {

    public static void main(String[] args) {
        int sum = IntStream.of(1, 3, 5, 7, 9).sum(); // stream de int

        System.out.println(sum);

        double average = DoubleStream.of(0.5d, 1.2d, 44.0d, 100.0d)  // stream de double
        .average().getAsDouble();

        System.out.println(average);

        int sumReduce = IntStream.generate(() -> (int)(Math.random() * 1000))
                .limit(20)
                .reduce(0, (x, y) -> x + y);

        System.out.println(sumReduce);


        int sum2 = IntStream.of(1, 3, 5, 7, 9)
                .reduce(0, (x, y) -> x + y);

        System.out.println(sum2);


        Stream.iterate(1, i -> i * 3)
                .limit(5)
                .forEach(System.out::println);

    }
}
