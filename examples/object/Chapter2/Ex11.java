class AllTheColorsOfTheRainbow{
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }
}
public class Ex11{
    public static void main(String[] args){
        AllTheColorsOfTheRainbow atcotr = new AllTheColorsOfTheRainbow();
        atcotr.changeTheHueOfTheColor(10);
        System.out.println(atcotr.anIntegerRepresentingColors);
    }
}