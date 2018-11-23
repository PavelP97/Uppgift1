package hotelldjuren;

public class Orm extends HotellDjuren{
    
    public Orm(String namn, int vikt) {
        super(namn,vikt);
        mat = 20;
        matNamn = "snake pellets";
    }
    @Override
    public void setFoodWeight(int vikt){
        mat = 20;
    }
    @Override
    public void changeWeight(int vikt){
        this.vikt = vikt;
        setFoodWeight(vikt);
    }
    @Override
    public void setFood() {
        matNamn = "snakepellets";
    }
    
    /*
    public void setOriginalFoodType(){
        matNamn = "snake pellets";
    }
    */
}
