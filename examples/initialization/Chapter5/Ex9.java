public class Ex9{
    int i;
    Ex9(){
        this(10);

    }
    Ex9(int i){
        this.i = i;
        System.out.println(this.i);
    }
    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        Ex9 ex92 = new Ex9(11);

    }
}
