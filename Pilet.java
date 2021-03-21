
import java.time.LocalDate;

public class Pilet {

    private final Number number;
    private final String reisijaNimi;
    private final int isikukood;
    private final Reis reis;

    public Pilet(Number number, String reisijaNimi, String isikukood, Reis reis) {
        this.number = number;
        this.reisijaNimi = reisijaNimi;
        this.isikukood = vanus(isikukood);
        this.reis = reis;
    }

    public Number getNumber() {
        return number;
    }

    public String getReisijaNimi() {
        return reisijaNimi;
    }

    public int getIsikukood() {
        return isikukood;
    }

    public Reis getReis() {
        return reis;
    }

    public static int vanus(String isikukood){ //tagastatakse kliendi vanust, et pärast piletile kirjutada
        StringBuilder synniaasta = new StringBuilder();
        if (isikukood.charAt(0) == '4' || isikukood.charAt(0) == '3'){
            synniaasta.append("19").append(isikukood, 1, 3);
        }else{
            synniaasta.append("20").append(isikukood,1,3);
        }

        return LocalDate.now().getYear() - Integer.parseInt(String.valueOf(synniaasta));
    }//vanus
}
