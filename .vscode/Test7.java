class Papa
{
    void earning()
    {
        System.out.println("I have 10cr");
    }
    void marriage ()
    {
        System.out.println("i want to marry sonam bajwa ");
    }
}
class child extends Papa
{
    void marriage()
    {
        super.marriage();
        System.out.println("i will marry my bea anabela  ");
    }
}

/**
 * Test7
 */
public class Test7 {

    public static void main(String[] args) {
        child obj = new child();
        obj.earning();
        obj.marriage();
    }
}
