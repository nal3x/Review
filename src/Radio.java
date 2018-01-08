//https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html

public class Radio {
    private int freq = setFreq(7);

    public Radio(int aFreq) {
        freq = aFreq;
        System.out.print(freq + " ");        
    }

    public int setFreq(int freq) {
        this.freq = freq;
        System.out.print(freq + " ");
	return freq;
	}
    
    public static void main(String args[]) {
        new Radio(20);
    }
}

