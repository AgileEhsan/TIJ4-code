public class Ex4{
    public static void main(String[] args) {
        for(int i=2;i <= 100;i++){
            boolean prime = true;
            for(int j=i-1;j>1;--j){
                if((i % j) == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.print(i + " ");
            }
        }
    }
}