package hr.java.vjezbe.entitet;

public class Predmet {

    private String sifra;
    private String naziv;
    private int brojEctsBodova;
    private Profesor nositelj;
    //private List<Student> lista;

    public Predmet(String sifra, String naziv, int brojEctsBodova, Profesor nositelj) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.brojEctsBodova = brojEctsBodova;
        this.nositelj = nositelj;
        //this.lista = new ArrayList<>();

    }

    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getBrojEctsBodova() {
        return brojEctsBodova;
    }

    public Profesor getNositelj() {
        return nositelj;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setBrojEctsBodova(int brojEctsBodova) {
        this.brojEctsBodova = brojEctsBodova;
    }

    public void setNositelj(Profesor nositelj) {
        this.nositelj = nositelj;
    }

    public String toString() {
        return getSifra() + ". " + getNaziv();
    }


}
