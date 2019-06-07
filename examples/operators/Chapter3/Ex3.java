class floattest{
    float f;
}
public class Ex3{
    public static void main(String[] args){
        floattest ft = new floattest();
        ft.f = 4.8f;
        System.out.println(ft.f);
        testmethod(ft);
        System.out.println(ft.f);

    }
    static void testmethod(floattest f){
        f.f = 5.8f;
    }
}