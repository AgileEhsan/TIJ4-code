import java.util.Random;

public class Ex2{
    static Random rand= new Random();
    public static void main(String[] args) {
        for(int i=0;i <25;i++){
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