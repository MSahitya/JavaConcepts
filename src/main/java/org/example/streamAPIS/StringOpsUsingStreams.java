package org.example.streamAPIS;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringOpsUsingStreams {
    public static void main(String[] args) {
        String sampleStr="ldskjflksdjlkfjsdfhsdkhfkdshfkjdshkfjdslkfjeoiruweoiyrweihxcnv,ncx,vm";

        //Identify the letter which is the 2 nd highest repetation

        Optional<Character> secondHighest = sampleStr.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter) // Filter out non-letter characters
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue(Comparator.reverseOrder()))
                .skip(1)
                .findFirst()
                .map(Map.Entry::getKey);

        secondHighest.ifPresentOrElse(
                character -> System.out.println("Second highest repeated letter: " + character),
                () -> System.out.println("No second highest repeated letter found.")
        );

        String str = "Hello, World!";
        System.out.println("Printing the String!!!!!!!!");
        str.chars().mapToObj(c->(char)c).filter(Character::isLetter).
                forEach(System.out::println);

        // 1. Stream of Characters from a String (IntStream -> Stream<Character>)
        Stream<Character> charStream = str.chars()
                .mapToObj(c -> (char) c);

        charStream.forEach(System.out::print); // Output: Hello, World!
        System.out.println();

        // 2. Filtering Characters
        String filteredStr = str.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Filtered Letters: " + filteredStr); // Output: Filtered Letters: HelloWorld

        // 3. Counting Character Occurrences
        Map<Character, Long> charCounts = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character Counts: " + charCounts);

        // 4. Checking if all characters meet a condition
        boolean allLetters = str.chars()
                .mapToObj(c -> (char) c)
                .allMatch(Character::isLetterOrDigit);

        System.out.println("All letters or digits: " + allLetters);

        // 5. Creating a Stream from an array of characters
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        Stream<Character> arrayCharStream = IntStream.range(0, charArray.length)
                .mapToObj(i -> charArray[i]);

        arrayCharStream.forEach(System.out::print); // Output: abcde
        System.out.println();

        // 6. Creating a Stream from a List of characters
        List<Character> charList = Arrays.asList('f', 'g', 'h', 'i', 'j');
        Stream<Character> listCharStream = charList.stream();

        listCharStream.forEach(System.out::print); // Output: fghij
        System.out.println();

        //7. Converting a character stream back to a string
        String backToString = "abcdefg".chars().mapToObj(c -> (char) c).map(String::valueOf).collect(Collectors.joining());
        System.out.println(backToString); // Output: abcdefg







    }
}
