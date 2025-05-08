package hr.java.vjezbe.entitet;

import java.util.ArrayList;

public interface Visokoskolska {

    public void izracunajKonacnuOcenuStudijaZaStudenta();

    public void odrediProsekOceneNaIspitima(ArrayList<Ispit> listaIspita);

    public void filtrirajPolozeneIspite(ArrayList<Ispit> listaIspita);

    public void filtrirajIspitePoStudenta();




}
