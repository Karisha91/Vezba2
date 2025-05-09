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

        int ocenaIspita = getListaIspita().get(0).getOcena();
        int ocenaZavrsnog = 0;
        int ocenaOdbrane = 0;
        System.out.println(ocenaIspita);



        // konacna ocena = (2 * prosek ocena studenta +
        // ocena zavrsnog rada + ocena odbrane zavrsnog ) / 4

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
    public ArrayList<Ispit> filtrirajPolozeneIspite(ArrayList<Ispit> listaIspita) {
        ArrayList<Ispit> polozeni = new ArrayList<>();
        for (Ispit ispit : listaIspita) {
            if (ispit.getOcena() > 1) {
                polozeni.add(ispit);
            }
        }
        return polozeni;

    }

    @Override
    public ArrayList<Ispit> filtrirajIspitePoStudenta(ArrayList<Ispit> listaIspita, Student student) {
        ArrayList<Ispit> novi = new ArrayList<>();
        for (Ispit ispit:
             listaIspita) {
            if (ispit.getStudent().getIme().equals(student.getIme())) {
                novi.add(ispit);
            }
        }
        return novi;
    }
    public String toString () {
        return getNazivUstanove();
    }

}
