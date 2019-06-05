public class Ex6{
    int storage(String s){ 
        return s.length() * 2; 
    } 
    public static void main(String[] args){
        Ex6 ex6 = new Ex6();
        String test = new String();
        test = "a Test String";
        System.out.println(ex6.storage(test));

    }
}