public interface MyInterface {
    public int function1(double x);
    public boolean function2(int a, int b);
}

class Class1 implements MyInterface {
  public int function1(int i) { return i; }
  public boolean function2(int x, int y) { return false; }
}

class Class2 implements MyInterface {
  public int function1() { return 5; }
  public boolean function2(int x, int y) { return false; }
}

class Class3 implements MyInterface {
  public int function1(double x) { return (int) x; }
  public boolean function2(int a, int b) { return true; }
}

class Class4 implements MyInterface {
  public int function1(double x) { return (int) x; }
}

class Class5 implements MyInterface {
  public int function1(double x) { return 5; }
  public char function3() {return 'a';}
  public boolean function2(int a, int b) { return true; }
}

class Class6 extends Class5 implements MyInterface {
  public char function3() {return 'a’;}
  public boolean function2(int a, int b) { return true; }
}

class Class7 implements MyInterface {
  public int function1(double x) { return 5; }
  public void function2(int a, int b) {return ;}
}





