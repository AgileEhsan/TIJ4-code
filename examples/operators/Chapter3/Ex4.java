import java.util.Random;

class Ex4{
    public static void main(String[] args){
        Random rand = new Random(47);
        float time = rand.nextFloat()+1;
        float dist = rand.nextFloat()+1;
        System.out.println(velocity(dist, time));

    }
    public static float velocity(float dist, float time){
        if(time !=0){
            return dist/time;
        }
        return 0;
    }
}