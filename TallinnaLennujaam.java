import java.util.ArrayList;

public class TallinnaLennujaam {

    private ArrayList<Lennuk> lennukid;
    private ArrayList<Reis> reisid;
    private final Administraator administraator;

    public TallinnaLennujaam(ArrayList<Lennuk> lennukid, ArrayList<Reis> reisid, Administraator administraator){
        this.lennukid = lennukid;
        this.reisid = reisid;
        this.administraator = administraator;
    } //Konstruktor Lennujaam

    public ArrayList<Lennuk> getLennukid() {
        return lennukid;
    }

    public void setLennukid(ArrayList<Lennuk> lennukid) {
        this.lennukid = lennukid;
    }

    public Administraator getAdministraator() {
        return administraator;
    }

    public ArrayList<Reis> getReisid() {
        return reisid;
    }

    public void setReisid(ArrayList<Reis> reisid) {
        this.reisid = reisid;
    }

    public void naitaKoikReisid(String asukoht){
        System.out.println("Kõik reisid: ");
        for (Reis reis : reisid) {
            System.out.println(reis);
        }
    }

    public void lisaReis(Reis reis){
        reisid.add(reis);
    }
    public void lisaLennuk(Lennuk lennuk){
        lennukid.add(lennuk);
    }

    @Override
    public String toString() {
        return "\n" + lennukid + "\n" + administraator + "\n" + reisid;
    }//toString

}//Klass Lennujaam


