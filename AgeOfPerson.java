//Program to calculate age
import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
public class AgeOfPerson {

    public static void main(String[] args) {
        //Input of a person Date Of Birth
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String dobInput = scanner.nextLine();
        // Get the current date
        LocalDate currentDate = LocalDate.now();
         // Parse the input into a LocalDate
        Period age = Period.between(LocalDate.parse(dobInput), currentDate);
        System.out.println("Your age is: " + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days.");
        scanner.close();
    }
}