package hr.java.vjezbe.entitet;

import java.util.ArrayList;


public class VeleucilisteJave extends ObrazovnaUstanova implements Visokoskolska {




    protected VeleucilisteJave(String nazivUstanove, ArrayList<Profesor> listaProfesora,
                               ArrayList<Student> listaStudenata, ArrayList<Predmet> listaPredmeta,
                               ArrayList<Ispit> listaIspita) {
        super(nazivUstanove, listaProfesora, listaStudenata, listaPredmeta, listaIspita);

    }

    @Override
    public void izracunajKonacnuOcenuStudijaZaStudenta() {

    }

    @Override
    public void odrediProsekOceneNaIspitima(ArrayList<Ispit> listaIspita) {
        int sum = 0;
        double prosek = 0;
        for (Ispit ispit :
                listaIspita) {
            if(ispit.getOcena() > 1) {
                sum = sum + ispit.getOcena();
                prosek = (double) sum / listaIspita.size();
            }


        }
        System.out.println(prosek);


    }



    @Override
    public void filtrirajPolozeneIspite(ArrayList<Ispit> listaIspita) {
        for (Ispit ispit :
                listaIspita) {
            if (ispit.getOcena() > 1) {
                System.out.println(ispit);
            }

        }

    }

    @Override
    public void filtrirajIspitePoStudenta() {

    }

}
