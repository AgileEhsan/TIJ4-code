public class Ex5{
    public static void main(String[] args) {
        int i1= 0x55;
        int i2=0xAA;
        System.out.println(tobinstr(i1));
        System.out.println(tobinstr(i2));
        System.out.println(tobinstr(i1 & i2));
        System.out.println(tobinstr(i1 | i2));
        System.out.println(tobinstr(i1 ^ i2));
        System.out.println(tobinstr(~i1));
        System.out.println(tobinstr(~i2));

    }
    public static String tobinstr(int in){
        String out="";
        int shift =0x80000000;
        boolean flag= false;
        for(int i=0; i<32 ; i++){
            if(i != 0 ){
                shift = shift >>> 1;
            }
            if(flag == false){
                if (~(in & shift) != -1){
                    out += (~(in & shift) == -1) ?"0":"1";
                    flag = true;
                }
            }else if(flag == true){
                out += (~(in & shift) == -1) ?"0":"1";
            }
        }
        out = out.isEmpty()?out+="0":out;
        return out;
    }
}