import static java.lang.System.out;

public class Duck2 { 
    public void fly() { 
        out.println("Fly away"); 
    }
//    public void fly(String s) {
//        //System.out.println("Fly like a Duck2");
//    }
    static void eat() {
        out.println("D is Eating..."); 
    }
    public void visit(int p1, int p2) {
        out.println("D goes to:"+p1+", "+p2);
   }
}
class SmallDuck extends Duck2 { 
   public void fly() { 
      out.println("Fly SD Fly"); 
   }
   public void fly(String str) { 
      out.println("Fly " + str); 
   }
   static void eat() {
      out.println("SD is hungry"); 
   }
   public void visit(int ... p) {
      for ( int i:p ) out.print(i+", ");}
   
   public static void main (String[] args) {
       Duck2 d = new Duck2();
        d.fly();
        d.fly("NY");
        d.eat();
        Duck2 d2 = new SmallDuck();
        d2.fly("London");
        d2.eat();
        SmallDuck d3 = new SmallDuck();
        d3.fly("Paris");
        d3.eat();
        d3.visit(5,4);
   }




}

