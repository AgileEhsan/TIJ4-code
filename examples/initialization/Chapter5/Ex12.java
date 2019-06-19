class Tank{
    static private int id;
    private boolean fill;
    Tank(boolean fill){
        this.fill = fill;
        
        System.out.println("Tank ID: "+ ++id + " has been Created");
    }
    /**
     * @return the filled
     */
    public boolean isFill() {
        return fill;
    }
    /**
     * @param fill the fill to set
     */
    public void setFill(boolean fill) {
        this.fill = fill;
    }
    public void empty(){
        setFill(false);
    }

    @Override
    protected void finalize(){
        if(isFill() == true){
            System.out.println("Error: The Tank ID: "+ id +" is not Empty");
        }
    }
    
}
public class Ex12{
    public static void main(String[] args) {
        //Tank t1 = new Tank(true);
        //t1.setFill(false);
        new Tank(true).empty();
        new Tank(true);
        System.gc();
        System.runFinalization();
    }
}