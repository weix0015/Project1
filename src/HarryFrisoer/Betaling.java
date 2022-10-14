// Isaac, Wei og Oliver

package HarryFrisoer;

public class Betaling {
    private int kort;
    private int kontant;
    private int kredit;
    private boolean kreditlån;
    private boolean wei;

    // getter for Betaling
    public int getKort(){
        return kort;
    }
    public int getKontant(){
        return kontant;
    }
    public int getKredit(){
        return kredit;
    }

    public boolean isKreditlån(){
        return this.kreditlån;
    }

    // setter for Betaling

    public void setKort(int newkort){
        this.kort=newkort;

    }
    public void setKontant(int newkontant){
        this.kontant=newkontant;
    }
    public void setKredit(int newkredit){
        this.kredit=newkredit;
    }
    public void setKreditlån(boolean newkreditlån){
        this.kreditlån=newkreditlån;
    }

    // constructor

    public Betaling(int kort, int kontant, int kredit, boolean kreditlån){
        this.kort=kort;
        this.kontant=kontant;
        this.kredit=kredit;
        this.kreditlån=kreditlån;
    }

    @Override
    public String toString() {
        return "Betaling{" +
                "kort=" + kort +
                ", kontant=" + kontant +
                ", kredit=" + kredit +
                ", kreditlån=" + kreditlån +
                '}';
    }
}