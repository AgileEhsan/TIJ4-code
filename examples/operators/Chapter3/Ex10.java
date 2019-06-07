public class Ex10{
    public static void main(String[] args) {
        int i1= 0x55;
        int i2=0xAA;
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toBinaryString(i2));
        System.out.println(Integer.toBinaryString(i1 & i2));
        System.out.println(Integer.toBinaryString(i1 | i2));
        System.out.println(Integer.toBinaryString(i1 ^ i2));
        System.out.println(Integer.toBinaryString(~i1));
        System.out.println(Integer.toBinaryString(~i2));
    }
}