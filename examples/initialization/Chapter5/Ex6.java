class Dog{
    void bark(){
        System.out.println("Without arg");
    }    
    void bark(String in, int in2){
        System.out.println("With String:"+ in + " "+in2);
    }
    void bark(int in, String in2){
        System.out.println("With integer:"+ in +" "+ in2);
    }
}
public class Ex6{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark("barked", 444);
        dog.bark(555, "hmmm");
    }
}