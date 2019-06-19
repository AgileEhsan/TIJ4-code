public class Ex21{
    public enum LVCurrency{
        IRR, VND, IDR, GNF, LAK, SLL, UZS,
    }
    public static void main(String[] args) {
        for(LVCurrency lvCurrency: LVCurrency.values()){
            System.out.println(lvCurrency + " Ordinal "+ lvCurrency.ordinal());
        }
        
    }
}