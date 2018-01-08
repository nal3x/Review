class Car {
    class Engine {
        private int i = 10;
        float km = 0.0f;
        private Engine() {System.out.println("Engine");}
        protected void StartEngine() 	{System.out.println("Vrooomm");}
    }    
}

public class Main {
    public static void main(String ... args) {
        Car c = new Car();
        Car.Engine ce = c.new Engine();
        System.out.println(ce.i);
        System.out.println(ce.km);
        ce.StartEngine();
    }
}
