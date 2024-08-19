package az.atlacademy.lesson35.FunctionalProgramming;

import java.util.List;
import java.util.Random;


public class LambdaExpression {
    public static void main(String[] args) {
        List<String> list= new Random()
                .ints(50,0,100)
                .filter(n -> n % 2 !=0)
                .boxed()
                .map(String::valueOf)
                .toList();
        System.out.println(list);
    }
}
