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
    public void filtrirajPolozeneIspite(ArrayList<Ispit> listaIspita) {

    }

    @Override
    public void filtrirajIspitePoStudenta() {

    }
}
