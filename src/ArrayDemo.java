import java.sql.SQLOutput;
import java.time.LocalDate;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println(args);

        Person person = new Person("Buddy","3vek",LocalDate.of(2001,9,12));
        person.lastName = "Smith"; // works from this class because the lastName variable is public, unlike the firstName and the middleName.
        person.dob = LocalDate.now(); // we can access this because both the Person class and this Class are in the same package, which is the default package.


    }
}
