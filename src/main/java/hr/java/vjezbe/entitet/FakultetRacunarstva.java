package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FakultetRacunarstva extends ObrazovnaUstanova implements Diplomski{


    protected FakultetRacunarstva(String nazivUstanove, ArrayList<Profesor> listaProfesora,
                                  ArrayList<Student> listaStudenata, ArrayList<Predmet> listaPredmeta,
                                  ArrayList<Ispit> listaIspita) {
        super(nazivUstanove, listaProfesora, listaStudenata, listaPredmeta, listaIspita);
    }

    @Override
    public Student odrediStudentaZaRektorovuNagradu() {
        return null;
    }

    @Override
    public void izracunajKonacnuOcenuStudijaZaStudenta() {

    }

    @Override
    public void odrediProsekOceneNaIspitima(ArrayList<Ispit> listaIspita) {

    }

    @Override
    public ArrayList<Ispit> filtrirajPolozeneIspite(ArrayList<Ispit> listaIspita) {
        return null;
    }

    @Override
    public ArrayList<Ispit> filtrirajIspitePoStudenta(ArrayList<Ispit> listaIspita, Student student) {
        return null;
    }
}
