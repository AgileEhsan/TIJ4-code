public class Ex14{
    public static void main(String[] args) {
        System.out.println(Ex14test.st1);
        System.out.println(Ex14test.st2);
    }
}
class Ex14test{
    static String st1 ="st1 Initialized";
    static String st2;
    static{
        st2 ="st2 Initialized";
    }
    public static void printmethod(){
        System.out.println(Ex14test.st1);
        System.out.println(Ex14test.st2);
    }

}
class TestPrinter{
    TestPrinter(String marker){
        System.out.println(marker +"Initialized");
    }

}
// i felt nothing sensible about this exercise 