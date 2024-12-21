//program to convert a list of strings in to uppercase
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static void main(String[] args) {
        // List of strings
        List<String> list = Arrays.asList("aBc","d","ef");

        // Convert each string to uppercase using map
        List<String> uppercaselist = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Uppercase Strings list: "+uppercaselist);
    }
}