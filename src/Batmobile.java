public class Batmobile extends Vehicle {
    public static void main(String args[]) {
        float batPower = 10.5f;
        System.out.println(totalPower(batPower, 8));
    }
}
class Vehicle {
    float totalPower(float x, float y) {
        return x+y;
    }
}
