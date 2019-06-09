public class Ex9{
    public static void main(String[] args) {
        fibonachi(Integer.parseInt(args[0]));
    }
    public static void fibonachi(int a){
        int b=1;
        int c=1;
        int temp;
        System.out.print(b+" "+c+" "); 
        while(true){         
            temp=c+b;
            b=c;
            c=temp;  
            if(c > a){
                break;
            } 
            System.out.print(c+" ");
        }
    }
}