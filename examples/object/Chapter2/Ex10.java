//args[0] is the first command-line argument and not the name of the program (as it is in C). 
public class Ex10{
    public static void main(String[] args){
        for(int i =0; i < args.length && i < 3; i++){
            System.out.println(args[i]);
        }
    }
}