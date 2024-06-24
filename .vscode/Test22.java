

public class Test22 {
    void fun1(){
        System.out.println("I am fun1 of the paraent class");
    }
    void fun2()
    {
        System.out.println("i am fun2 of the parant class");
    }
}
class child extends Parent 
{
    void fun1(){
        System.out.println("i am fun of child class");
    }
    void fun3()
    {
        System.out.println("i am fun3 of the child class");

    }

    class Test{
        public static void main(String[] args) {
            Parent obj = new child();
            obj.fun1();
        }
    }
   
}
