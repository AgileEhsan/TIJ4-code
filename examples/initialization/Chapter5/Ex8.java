public class Ex8{
    public void method1(){
        this.method2();
        method2();
    }
    public void method2(){
        System.out.println("Method2");
    }
    public static void main(String[] args) {
       Ex8 ex8 =new Ex8();
       ex8.method1();
    }
}
