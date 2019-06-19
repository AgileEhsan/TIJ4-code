public class Ex10{
    public static void main(String[] args) {
        Test test = new Test();
    }
}
class Test{
    @Override
    protected void finalize(){
        System.out.println("Finalize Called");
    }
}