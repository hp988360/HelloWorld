import java.time.LocalDate;

public class Person {

    //same as "public class Person extends Object" The Object Superclass

    public boolean multiply;
    private String middleName = "Yogi";
    private String firstName;
    public String lastName;
    protected LocalDate dob;


    String person = "String";

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() {
        return middleName.charAt(0);
    }

    public int add(int num1, int num2) {
        return Math.addExact(num1, num2);
    }

    public int multiply (int int3, int int4) {
        return Math.multiplyExact(int3, int4);
    }

    public void test(int num1, int num2, String words) {

        // do something with words 

    }

    public Person() {

    }

    public Person(String firstName, String lastName, LocalDate dob) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;

    }


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.firstName = "Jacob";
        p1.lastName = "Smith";
        p1.sayHello();
        p1.saySomething("My Groovy Message!");
        p1.add(2,4);
        p1.multiply(5,9);
    }

    public void test2(int num1, int num2, String... words) {
     
        //do something with words again

    }
}