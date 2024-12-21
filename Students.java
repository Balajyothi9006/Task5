//Program to print list of students names start with letter A
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Students {
    public static void main(String[] args) {
        //list interface to store student names in to Arraylist
        List<String> students = Arrays.asList("Jyothi","Dharani","Pavani","Avinash","Anirudh","Prasad","Aswani","Aadhya","Kavya","Pawan");
        //Lambda expression and Stream API to filter student names
        List<String> filteredStudents = students.stream().filter(name -> name.startsWith("A") ).collect(Collectors.toList());
        System.out.println("Students names start with A: "+filteredStudents);
    }
}