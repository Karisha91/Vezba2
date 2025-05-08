package hr.java.vjezbe.entitet;

import java.time.LocalDateTime;

public class Ispit {

    private Predmet predmet;
    private Student student;
    private int ocena;
    private LocalDateTime datumIvreme;


    public Ispit(Predmet predmet, Student student, int ocena, LocalDateTime datumIvreme) {
        this.predmet = predmet;
        this.student = student;
        this.ocena = ocena;
        this.datumIvreme = datumIvreme;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public Student getStudent() {
        return student;
    }

    public int getOcena() {
        return ocena;
    }

    public LocalDateTime getDatumIvreme() {
        return datumIvreme;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public void setDatumIvreme(LocalDateTime datumIvreme) {
        this.datumIvreme = datumIvreme;
    }

    public String toString () {
        return getPredmet() + " " + getStudent() + " " + getDatumIvreme() + " " + getOcena();
    }
}
