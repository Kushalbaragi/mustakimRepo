import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(0,1,2,3,6,8,10,13,16,2,3,16,5);
        Set<Integer> set=new HashSet<>();
        String str="My name is Mustakim";
        //Even or Odd
        list.stream().filter(n->n%2==0).forEach(System.out::println);

        //Duplicate numbers
        System.out.println("Duplicate numbers");
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);

        System.out.println("Total numbers");
        System.out.println(list.stream().count());

        System.out.println("Maximum and Minimum value");
        Integer max = list.stream().max(Integer::compareTo).get();
        Integer min=list.stream().min(Integer::compareTo).get();
        System.out.println(max+" "+min);

        System.out.println("Occurance");
        LinkedHashMap<String, Long> occurances = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(occurances);

        System.out.println("---------------------");
        list.stream().map(n->n*3).filter(i->i>10&i<20).forEach(System.out::println);

        System.out.println("-------------------");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("Sum VAlue -------------------");
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum : "+sum);


        // String Operations

        List<StringBuilder> collect = Stream.of(str).map(n -> new StringBuilder(n).reverse()).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("--------------Map Programs--------------");


    }
}