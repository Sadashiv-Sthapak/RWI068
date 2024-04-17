interface MyInterface {
    void abstractMethod();
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Concrete implementation of abstractMethod() in MyClass");
    }
}

public class Interface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.abstractMethod();
    }
}