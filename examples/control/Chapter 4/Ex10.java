public class Ex10{
    public static void main(String[] args) {
        int first=0;
        int second=0;
        for(int i=1000;i <= 10000;i++){
            int[] a=new int[4];
            a[3]=i/1000;
            a[2]=(i-(a[3]*1000))/100;
            a[1]=(i-(a[3]*1000)-(a[2]*100))/10;
            a[0]=(i-(a[3]*1000)-(a[2]*100)-(a[1]*10));
            for(int j =0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(j==k){continue;}
                    for(int l=0;l<4;l++){
                        if(l==k || l==j){continue;}
                        for(int m=0;m<4;m++){
                            if(m==l || m==k || m==j){continue;}
                            if(i==(((10*a[j])+a[k])*((10*a[l])+a[m]))){
                                if (second == ((10*a[j])+a[k]) ||
                                    first == ((10*a[j])+a[k])){continue;}
                                first = (10*a[j])+a[k];
                                second = (10*a[l])+a[m];
                                System.out.println(i + " = " + first +"*" + second);
                            }
                        }
                    }
                }
            }
        }
    }
}