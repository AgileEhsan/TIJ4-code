public class Ex14{
    public static void main(String[] args) {
        compare("Hello", "Hello");
        String a = new String("Hello");
        //a="Hello";
        compare("Hello", a);
        compare(a, "Goodbye");
        
    }    
    public static void compare(String a, String b){
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a.equals(b));
    }
}