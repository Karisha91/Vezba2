package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.util.ArrayList;

public interface Visokoskolska {

    public BigDecimal izracunajKonacnuOcenuStudijaZaStudenta(ArrayList<Ispit> listaIspita, int zavrsnaOcena, int ocenaOdbrane);

    public BigDecimal odrediProsekOceneNaIspitima(ArrayList<Ispit> listaIspita);

    public ArrayList<Ispit> filtrirajPolozeneIspite(ArrayList<Ispit> listaIspita);

    public ArrayList<Ispit> filtrirajIspitePoStudentu(ArrayList<Ispit> listaIspita, Student student);




}
