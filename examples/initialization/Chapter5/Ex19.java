public class Ex19{
    public static void varargmethod(String... arguments){
        for (String st: arguments){
            System.out.println(st);
        }
    }
    public static void main(String[] args) {
        varargmethod("First string ","Second String","Third string");
        String[] test = {"1st","2st","3st"};
        varargmethod(test);
        varargmethod(new String[]{"string 1","String 2","string 3"});
        varargmethod();
    }
}