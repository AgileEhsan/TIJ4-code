public class Ex11{
    public static void main(String[] args) {
        //Test test = new Test();
        new Test();
        System.gc();
        System.runFinalization();
    }
}
class Test{
    @Override
    protected void finalize(){
        System.out.println("Finalize Called");
    }
}