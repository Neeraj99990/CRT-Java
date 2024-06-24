class grandfather
{
private void smokebidi()
{
    System.out.println("i am smoking bidi");

}
void earned()
{
    System.out.println("i have cr");
}
}
class father extends grandfather
{
    private void smoke ()
    {
        System.out.println("I love cigrate ");
    }
    void earned()
{
    System.out.println("i have 10 cr ");
}
}

class child extends father
{
    void  study()
    {
        System.out.println("i am studying");
    }
}

/**
 * Test8
 */
public class Test9 {

    public static void main(String[] args) {
        child obj = new child();
        obj.study();
        obj.earned();
    }
}