public class Ex13{
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(toInt(c));
    }
    public static String toInt(char ch){
        return Integer.toBinaryString((int)ch);
    }
}