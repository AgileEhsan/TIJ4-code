public class Ex11{
    public static void main(String[] args) {
        int i1= 0x80000000;
        for(int i= 1;i<32;i++){
            i1>>=1;
            System.out.println(Integer.toBinaryString(i1));
        }
    }
}