package main;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Function;
//import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

        /*Function<Integer, Integer> dobrar = num -> num*2;

        List<Integer> numDobrados = lista.stream()
                .map(dobrar)
                .toList();*/

        List<Integer> numDobrados = lista.stream()
                .map(n -> n*2)
                .toList();

        numDobrados.forEach(n -> System.out.println(n));
    }
}
