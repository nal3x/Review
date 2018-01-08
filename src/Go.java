class Character { 
    void sleep() { System.out.println("What?");} }

class Troll extends Character { 
    void sleep() {System.out.println("zzz...");} }

class Magician extends Character { 
    void sleep() {System.out.println("sss...");} }

class Elf extends Character { 
    void sleep() {System.out.println("fff...");} }

class Mermade extends Character { 
    int sleep(int i) {return i;} }

class Warrior extends Character {}
//Τι θα συμβεί αν εδώ προσθέσουμε τη δήλωση:
//class Ghost extends Character { int sleep() {return 5}; }

public class Go {
    public static void main( String args[] ) {
    Character[] cArray={new Troll(),new Magician(),new Elf(),new Mermade(),new Warrior()};
        for (Character an : cArray) an.sleep(); 
    } 
}



