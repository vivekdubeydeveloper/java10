package java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomGeneratorChange {
    public static void main(String[] args) {
        //This is previous one
        RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create();
        System.out.println(randomGenerator.getClass());
        IntStream.rangeClosed(1,20).forEach(x->{
            System.out.println(randomGenerator.nextInt(50));
        });

        //Get All Random Generator
        RandomGeneratorFactory.all().map(rgf->String.join(":",rgf.group(),rgf.name())).forEach(System.out::println);

        //Choose custom algorithm

        RandomGenerator randomGenerator1 = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();
        System.out.println(randomGenerator1.getClass());
        IntStream.rangeClosed(1,20).forEach(x->{
            System.out.println(randomGenerator1.nextInt(50));
        });
    }
}
