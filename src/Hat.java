public class Hat {
    private final int t1;
    private final int t2;

    public Hat(int t1, int t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public Hat join(Hat h) { //joins two hats
        this.t1 = this.t1 + h.t1;
        this.t2 = this.t2 + h.t2;
        return new Hat(t1, t2); 
}

    public static void main(String args[]) {
        Hat h1 = new Hat(5,6);
        Hat h2 = new Hat(7,8);
        Hat h3 = h1.join(h2);
        System.out.println(h3.t1+" "+h3.t2);
    } 
}
