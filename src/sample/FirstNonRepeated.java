package sample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {

    public static void main(String[] args) {
        String str = "ava is awesome";

        Character nonrepeated = str.chars().mapToObj(s -> Character.toLowerCase((char) s))  //First Convert to character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))  //Store the characters in map with count
                .entrySet().stream().filter(mp -> mp.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println("Non repeated character is =>"+nonrepeated);
    }

}
