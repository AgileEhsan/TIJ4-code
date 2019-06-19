class Ex2{
    String st1 = new String("at Defenition");
    String st2 ;
    Ex2(){
        st2 = "at Construction";
    }
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        System.out.println(ex2.st1);
        System.out.println(ex2.st2);
    }
}