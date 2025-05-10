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
    public Student odrediNajuspesnijegStudentaNaGodini(int godina) {
        return null;
    }

    @Override
    public Student odrediStudentaZaRektorovuNagradu() {
        return null;
    }


    @Override
    public BigDecimal izracunajKonacnuOcenuStudijaZaStudenta(ArrayList<Ispit> listaIspita, int zavrsnaOcena, int ocenaOdbrane) {
        return null;
    }

    @Override
    public BigDecimal odrediProsekOceneNaIspitima(ArrayList<Ispit> listaIspita) {
        return null;
    }

    @Override
    public ArrayList<Ispit> filtrirajPolozeneIspite(ArrayList<Ispit> listaIspita) {
        return null;
    }

    @Override
    public ArrayList<Ispit> filtrirajIspitePoStudentu(ArrayList<Ispit> listaIspita, Student student) {
        return null;
    }
}
