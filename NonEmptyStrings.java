//Program to print list of non empty strings

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class NonEmptyStrings {
    public static void main(String[] args) {

            List<String> list = Arrays.asList("abc","","bd","efg","abcd","","jkl");

            // Filter non-empty strings
            List<String> nonEmptyList = list.stream()
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.toList());

            // Print the non-empty strings
            System.out.println("Non empty strings list: " + nonEmptyList);
        }
    }

