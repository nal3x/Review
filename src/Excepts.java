
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excepts {
    private static String mystery(int count) throws Exception {
        if (count == 1)
            throw new FileNotFoundException();
        else if (count == 2)
            throw new IOException();
        else if (count == 3)
            throw new NumberFormatException();
        else if (count == 4)
            return "ABC";
        else
            throw new RuntimeException(); 
    }
    
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(mystery(i));
                System.out.println("YES");
                }
            catch (FileNotFoundException e) {
                System.out.println("FNF");
            }
            catch (IOException e) {
                System.out.println("IO");
            }
            catch (RuntimeException e) {
                System.out.println("RT");
            }
            catch (Exception e) {
                System.out.println("EX");
            }
            System.out.println("NO");
        }
    } 
}


