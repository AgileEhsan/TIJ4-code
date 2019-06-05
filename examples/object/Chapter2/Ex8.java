class Ex8{
    static int i;
    public static void main(String[] args){
        Ex8 a = new Ex8();
        Ex8 b = new Ex8();
        Ex8.i = 1;
        a.i += 1;
        b.i += 2;
        System.out.println(Ex8.i +"="+ a.i +"="+ b.i );
    }
}