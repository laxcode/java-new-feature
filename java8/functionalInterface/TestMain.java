package java8.functionalInterface;

import java.math.BigDecimal;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestMain {
    public static void main(String[] args) {
        Creator creator = ()->System.out.println("I have used functional interface as part of this. ");;
        Consumer<String> consumer = a->System.out.println("This is an example of Consumer functional interface. Ok fine "+a);
        BiConsumer<String,String> biConsumer=(firstName,lastName)->System.out.println("Hey "+lastName+","+firstName+" \n You are currentelly using BIConsumer functional interface");
        DoubleConsumer doubleConsumer=(a)->System.out.println(a);
        Function<String,Integer> function=a->a.length();
        BiFunction<String,String,Integer> biFunction=(firstName,lastName)->firstName.length()+lastName.length();
        BinaryOperator<String> binaryOperator = (firstName,lastName)->"Hey "+lastName+","+firstName+" \n You are currentelly using BIConsumer functional interface";
        Predicate<String> predicate=a-> a != null;
        BiPredicate<String,String> biPredicate=(a,b)->a!=null && b != null;
        System.out.println("Welcome to gitpod world");
        creator.create();
        consumer.accept("Laxminarayan");
        biConsumer.accept("B Laxminarayan", "Patra");
        System.out.println("Count: "+ function.apply("Laxminarayan"));
        System.out.println("Total Count: "+biFunction.apply("Laxminarayan", "Patra"));
        System.out.println("Full Name: "+binaryOperator.apply("Laxminarayan", "Patra"));
        doubleConsumer.accept(10.5);
        System.out.println("Predicat: "+predicate.test(null));
        System.out.println("Predicat: "+predicate.test("test"));
        System.out.println("BIPredicate: "+biPredicate.test(null, null));
        System.out.println("BIPredicate: "+biPredicate.test("Param1", "Param2"));

    }
}
