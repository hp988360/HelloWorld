package package2;

public class ClassB {

    public void publicMethod() {
        System.out.println("This is the public method of ClassB.");
        privateMethod(); //means this is now an instance of privateMethod in the public one??
    }

    private void privateMethod (){ //can serve as a helper to the public methods
        System.out.println("This is the private method of ClassB.");
    }

    protected void protectedMethod () {
        System.out.println("This is the protected method of ClassB");

    }

    void packageProtected() {
        System.out.println("This is the package protected method of ClassB");
    }

}
