package hr.java.vjezbe.entitet;

import java.time.LocalDate;

public class Student extends Osoba{
    private String jmbg;
    private LocalDate datumRodjenja;

    public Student(String ime, String prezime, String jmbg, LocalDate datumRodjenja) {
        super(ime, prezime);
        this.jmbg = jmbg;
        this.datumRodjenja = datumRodjenja;

    }

    public String getJmbg() {
        return jmbg;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String toString() {
        return getIme() + " " + getPrezime() + " " + getDatumRodjenja();
    }
}
