package streambasics;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {

    public static void main(String[] args) {
        String str = "Hello world";

        var charFreq = str.chars().mapToObj(ch -> (char) ch).filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charFreq.entrySet().forEach(System.out::println);
    }

}
