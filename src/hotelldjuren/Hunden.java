/*
 * 
 */
package hotelldjuren;

/**
 *
 * @author pavel
 */
public class Hunden extends HotellDjuren {
    private final int ratio = (100);
    
    public Hunden(String namn, int vikt) {
        super(namn, vikt);
        mat = vikt / ratio;
        matNamn ="dog food";
    }
    
    @Override                                   // interface
    public void setFoodWeight(int vikt){
        mat = vikt / ratio;
    }
    
    public void setOriginalFoodType(){
        matNamn ="dog food";
    }
    public void changeW(int vikt){
        this.vikt = vikt;
    }
    
    public void ownWeight(int vikt){
        this.vikt = vikt;
        setFoodWeight(vikt);
    }
    @Override                                  // interface,                 must implement all methods of interface
    public void changeWeight(int vikt) {}
    @Override                                  // interface
    public void setFood() {}
}
