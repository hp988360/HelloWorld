import java.time.LocalDate;

public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World! Nice to meet you.");

        Person johnny = new Person("johnny", "deez", LocalDate.of(2000,1,1));

        System.out.format("The person's first name is: %s.", johnny.getFirstName());

        johnny.setLastName("deez");

        System.out.format("The person's last name is: %s.", johnny.getLastName());


        // String = Text

    }
}