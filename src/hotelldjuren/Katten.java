package hotelldjuren;

public class Katten extends HotellDjuren {
    private final int ratio =(150);
    public Katten(String namn, int vikt ) {
        super(namn, vikt);
        mat = vikt / ratio;
        matNamn ="cat food";
    }

    @Override
    public void setFoodWeight(int vikt){
        mat = vikt / ratio;
    }
    public void setOrginalFoodType(){
        matNamn ="cat food";
    }
    public void changeWight(int vikt){
        this.vikt = vikt;
    }
    public void ägraVikt(int vikt){
        this.vikt = vikt;
        setFoodWeight(vikt);
    }
    @Override
    public void changeWeight(int vikt) {}
    @Override
    public void setFood() {}

}
