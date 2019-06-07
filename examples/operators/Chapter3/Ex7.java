import java.util.Random;

class coin{
    boolean side;
    void flip(){
        Random rand = new Random();
        side = rand.nextBoolean();
    }
}
public class Ex7{
    public static void main(String[] args) {
        coin c = new coin();
        c.flip();
        System.out.println(c.side);
        c.flip();
        System.out.println(c.side);
        c.flip();
        System.out.println(c.side);
        c.flip();
        System.out.println(c.side);
    }
}