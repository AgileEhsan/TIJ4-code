import static net.mindview.util.Print.*;
public class Ex2{
    public static void main(String[] args){
        alaistest at1 = new alaistest();
        alaistest at2 = new alaistest();
        at1.f =2.3f;
        at2.f =3.2f;
        print(at1.f);
        print(at2.f);
        at1= at2;
        print(at1.f);
        print(at2.f);
        at1.f =5.1f;
        print(at1.f);
        print(at2.f);
    }


}
class alaistest{
    float f;

}
