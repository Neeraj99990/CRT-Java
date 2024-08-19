interface makan 
{
    public abstract void BHK3();
    public abstract void Gardan();
    void swimpool();
}
class Thekedar implements makan {
    public void BHK3() {
        System.out.println("I made bhk 3");
    }
    public void Gardan(){
        System.out.println("I made a beautiful gardan ");
    }
    public void swimpool(){
        System.out.println("I made a swimming pool");
    }
        
}

/**
 * Test23
 */
public class Test23 {

    public static void main(String[] args) {
        Thekedar obj = new Thekedar();
        obj.BHK3();
        obj.swimpool();
        obj.Gardan();
    }
}