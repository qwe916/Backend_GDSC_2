package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("lee", "han", "cho");
        List<String> concatTarget = Arrays.asList("GDSC CORE");
        List<List<String>> complexList = Arrays.asList(
                Arrays.asList("core", "lee"),
                Arrays.asList("core", "han"),
                Arrays.asList("core", "cho")
        );
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);

        //스트림 생성하기
        Stream<String> listStream = list.stream();
        IntStream intStream = IntStream.range(1, 5);//1~4
        LongStream longStream = LongStream.rangeClosed(1, 5);// 1~5
        Stream<String> unitedStream = Stream.concat(concatTarget.stream(), listStream); //스트림 합치기

        //스트림 가공하기
        //filtering
        System.out.println(list.stream().filter(name -> name.contains("h")).collect(Collectors.toList()));
        //Mapping
        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
        //FlatMapping 평탄화
        System.out.println(complexList.stream().flatMap(Collection::stream).map(String::toUpperCase).collect(Collectors.toList()));
        //Sorting
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        //Iterating
        list.stream().peek(System.out::print).collect(Collectors.joining());
        System.out.println();

        //스트림 결과 만들기
        //Calculating
        long count = intStream.count();
        System.out.println(count);
        long sum = longStream.sum();
        System.out.println(sum);
        //Reducing
        System.out.println(numList.stream().reduce(0, Integer::sum));
        //Collecting
        System.out.println(list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
        //Matching
        System.out.println(list.stream().allMatch(s -> s.length() == 3));
        //Iterating
        list.stream().forEach(System.out::println);
    }
}
