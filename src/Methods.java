import java.time.LocalDate;

public class Methods {
    private final String  middleName = "Yogi";
    public  static double PI = 3.14;
    public static int[] nums = initNums();

    static {
        nums = new int[ 5 ];
        nums[ 0 ] =5;nums[ 1 ] = 392;
        nums[ 2 ] = 1;
        nums[ 3 ] = 2929;
        nums[ 4 ] = 202;
    } public static int[] initNums(){  nums = new int[ 5 ];
        nums[ 0 ] =5;nums[ 1 ] = 392;
        nums[ 2 ] = 1;
        nums[ 3 ] = 2929;
        nums[ 4 ] = 202; return nums;
    }
  public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial () {
        return  middleName.charAt(0);
    }

    public int add(int num1, int num2) {
        return  Math.addExact(num1, num2);

    }

    public void test(String[] words) {

        // do something with words

    }

    public void test2(String... words) {

        //do something with words again

    }

    public int multiply (int int3, int int4) {
        return Math.multiplyExact(int3, int4);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Hi","Hello", LocalDate.of(5,5,0005));
        p1.sayHello();
        p1.saySomething("What's Up");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(5,7));
        System.out.println(PI);
        String[] words = new String[] {"one", "two", "three"};
        p1.test(3,7, "a" );
        p1.test2( 1, 3,"three");
        System.out.println(words.length);
        System.out.println(p1.multiply(5,7));



        //

     }


}