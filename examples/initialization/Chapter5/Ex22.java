public class Ex22{
    public enum LVCurrency{
        IRR, VND, IDR, GNF, LAK, SLL, UZS,
    }
    LVCurrency lvc;
    public static void main(String[] args) {
        for(LVCurrency lvCurrency: LVCurrency.values()){
            System.out.println(lvCurrency + " Ordinal "+ lvCurrency.ordinal());
            switch(lvCurrency){
                case IRR:
                System.out.println("irr");
                break;
                case VND:
                System.out.println("vnd");
                break;
                case IDR:
                System.out.println("idr");
                break;
                case GNF:
                System.out.println("gnf");
                break;
                case LAK:
                System.out.println("lak");
                break;
                case SLL:
                System.out.println("sll");
                break;
                case UZS:
                System.out.println("uzs");
                break;
            }
        }
        
    }
}