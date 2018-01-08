public class Creature {
    protected int revive(short x, short y) {
        return x*y;
    }
}

class Dragon extends Creature {
	public static void main(String args[]) {
		short val1 = 7, val2 = 1;
		System.out.println(revive(val1, val2));
    }
}
