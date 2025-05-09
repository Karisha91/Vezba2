package hr.java.vjezbe.entitet;

import java.util.ArrayList;

public interface Visokoskolska {

    public void izracunajKonacnuOcenuStudijaZaStudenta();

    public void odrediProsekOceneNaIspitima(ArrayList<Ispit> listaIspita);

    public ArrayList<Ispit> filtrirajPolozeneIspite(ArrayList<Ispit> listaIspita);

    public ArrayList<Ispit> filtrirajIspitePoStudenta(ArrayList<Ispit> listaIspita, Student student);




}
