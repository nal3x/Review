class Bird {
    String name;
    float weight;
    
    public Bird(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }
    
    {System.out.println("Bird!");}
    //σημείο 1 
}

class Duck extends Bird {
    private boolean feathers;
    //σημείο 2
    static {System.out.println("Duck!");}
    //σημείο 3
    //{System.out.println("Bird - Duck!");} 
    
    public Duck(String name, float weight, boolean feathers) {
        super(name, weight);
        this.feathers = feathers;  
    }
      public static void main(String[] args) {
        Duck d1 = new Duck("Joe",4.12f, true);
        Duck d2 = new Duck("Felix",4.12f, false);  }
}

