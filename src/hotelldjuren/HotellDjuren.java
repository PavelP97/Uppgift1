package hotelldjuren;


public abstract class HotellDjuren implements DjurVikten{ 
     protected String namn;
     protected int vikt;
     protected int mat;
     protected String matNamn;

    HotellDjuren(String namn, int vikt){
        this.namn = namn;
        this.vikt = vikt;
        }
    
    HotellDjuren(){}
    
    public String getName(){
        return namn;
    }
    
    public String getMatNamn(){
        return matNamn;
    }
    
     public double getMatVikt(){ // 
       return mat;
    }
    public String writeOut(){
        String m = getName() + " should get " + (int)getMatVikt() + " grams of " + getMatNamn() + " today.";
        return m;
    }
//    public double getVikt(){
//        return vikt;
//    }
}
