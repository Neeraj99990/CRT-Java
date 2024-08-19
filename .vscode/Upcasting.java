class Child{
    void fun1() {
        System.out.println("I am fun1 of the parent class");
    }

    void fun2() {
        System.out.println("I am fun2 of the parent class");
    }
}

class Child extends Parent {
    void fun1() {
        System.out.println("I am fun1 of the child class");
    }

    void fun3() {
        System.out.println("I am fun3 of the child class");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.fun1();
    }
}
