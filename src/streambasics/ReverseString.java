package streambasics;

import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello world";
        String collect = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return list.stream().map(String::valueOf).collect(Collectors.joining());
                        }));
        System.out.println("Original String => "+str);
        System.out.println("Reverse String => "+collect);
    }

}
