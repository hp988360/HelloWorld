public class Person {

    //same as "public class Person extends Object" The Object Superclass

    public boolean multiply;
    private String middleName = "Yogi";

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

    public void test2(int num1, int num2, String... words) {
     
        //do something with words again

    }
}