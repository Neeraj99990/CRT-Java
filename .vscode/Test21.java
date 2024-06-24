public class Test21 {
    Test21() {
        System.out.println("T am a constructor");
    }

    void fun() {
        System.out.println("I am a method ");
    }

    public static void main(String[] args) {
        Test21 obj = new Test21();
        obj.fun();
    }
}
