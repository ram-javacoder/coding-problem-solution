package com.javalearn17.codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodeTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "is", "cool", "language");
        list.forEach((e) ->

                e.chars().mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(i -> i,Collectors.counting() ))
                        . entrySet().stream().filter(c -> c.getValue() > 1)
                        . map(Map.Entry::getKey)
                        .forEach(a -> System.out.println("Output: " +a))
        );

    }
}