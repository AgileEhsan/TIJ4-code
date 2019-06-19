public class Ex18{
    Ex18(String in){
        System.out.println(in);
    }
    public static void main(String[] args) {
        Ex18[] ex18 = new Ex18[5];
        //Ex18[] ex18;   
        for(int i=0;i< ex18.length; i++){
            ex18[i]=new Ex18(Integer.toString(i));
        }

    }
}