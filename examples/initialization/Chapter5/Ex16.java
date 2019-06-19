import java.util.Random;

public class Ex16{
    //String[] st1 = new String[new Random(47).nextInt()];
    /*String[] st ={"string 1",
                  "string 2",
                };
    */
    String[] st =new String[]{"string 1",
                  "string 2",
                };

    public static void main(String[] args) {
        Ex16 ex16 = new Ex16();
        for (String s : ex16.st) {
            System.out.println(s);            
        }        
    }
}