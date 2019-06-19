class Dog{
    void bark(){
        System.out.println("Without arg");
    }    
    void bark(String in){
        System.out.println("With String:"+ in);
    }
    void bark(int in){
        System.out.println("With integer:"+ in);
    }
}
public class Ex5{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark("barked");
        dog.bark(555);
    }
}