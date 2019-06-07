class Dog{
    String name;
    String says;
    void printdog(){
        System.out.println(this.name + " Syas: " +this.says);
    }
}
public class Ex5{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";
        dog2.name = "scruffy";
        dog1.says = "Ruff!";
        dog2.says = "Wurf!";
        dog1.printdog();
        dog2.printdog();
    }
}