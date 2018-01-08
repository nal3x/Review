class Tree {
    Tree() {
        System.out.println("A Tree"); 
    }
    public void m1(Tree t) {
        System.out.println("Tree - m1"); 
    }
    public void m2(Tree t) { 
        System.out.println("Tree - m2"); 
    }
}
class Deciduous extends Tree { //Fyllobolo!
    Deciduous() { 
        System.out.println("A Deciduous"); 
    }
    public void m1(Deciduous d) { 
        System.out.println("Deciduous - m1"); 
    }
    public void m2(Tree t) { 
        System.out.println("Deciduous - m2"); 
    }
    {System.out.println("Hi");} }

class Sycamore extends Deciduous { //Fikos!
    Sycamore() {
        System.out.println("A Sycamore"); 
    }
    Sycamore(String str) {
        this();
        System.out.println(str);
    }
    public void m1(Tree t) {
        System.out.println("Sycamore - m1");
    }
    public void m1(Deciduous d) {
        System.out.println("Sycamore - m2");
    }
    public void m2(Deciduous d) {
        System.out.println("Sycamore - m3");
    }
}   

