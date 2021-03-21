public class Administraator {

    private final String nimi;
    private final String parool;

    public Administraator(String nimi, String parool) {
        this.nimi = nimi;
        this.parool = parool;
    }

    public String getNimi() {
        return nimi;
    }

    public String getParool() {
        return parool;
    }
}
