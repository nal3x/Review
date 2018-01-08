
public class Tree1 {
    
    public Tree1(int x) {
        System.out.print("A Tree1");
    }
}

class Eucalyptus extends Tree1 {

    public Eucalyptus(int x) {
        System.out.print("An Eucalyptus" + x);
    }

    public Eucalyptus() {
        this(700);
        System.out.print("An Eucalyptus");
    }
    
    public static void main (String[] args) {
        new Eucalyptus();
    }

}
