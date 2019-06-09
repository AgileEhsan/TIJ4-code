import java.util.Random;

public class Ex3{
    static Random rand= new Random();
    public static void main(String[] args) {
        while(true){
            compareTwo();
        }
    }
    public static void compareTwo(){
        int r = rand.nextInt();
        int s = rand.nextInt();
        if(r<s){
            System.out.println("r<s");
        }else if(r>s){
            System.out.println("r>s");
        }else{
            System.out.println("r=s");
        }
    }
}