class Ex4{
    Ex4(){
        System.out.println("object from Class Ex3 Created");
    }
    Ex4(String in){
        System.out.println("object from Class Ex3 Created:"+ in);
    }
    public static void main(String[] args) {
        Ex4 ex4 =new Ex4();
        Ex4 ex42 = new Ex4("String that passed");
    }
}