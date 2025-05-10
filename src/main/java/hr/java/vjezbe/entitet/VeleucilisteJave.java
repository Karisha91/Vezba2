package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class VeleucilisteJave extends ObrazovnaUstanova implements Visokoskolska {




    protected VeleucilisteJave(String nazivUstanove, ArrayList<Profesor> listaProfesora,
                               ArrayList<Student> listaStudenata, ArrayList<Predmet> listaPredmeta,
                               ArrayList<Ispit> listaIspita) {
        super(nazivUstanove, listaProfesora, listaStudenata, listaPredmeta, listaIspita);

    }

    @Override
    public Student odrediNajuspesnijegStudentaNaGodini(int godina) {
        return null;
    }

    @Override
    public BigDecimal izracunajKonacnuOcenuStudijaZaStudenta(ArrayList<Ispit> listaIspita, int zavrsnaOcena, int ocenaOdbrane) {

        BigDecimal ocenaIspita = odrediProsekOceneNaIspitima(listaIspita);

        BigDecimal result = ocenaIspita.multiply(new BigDecimal(2))
                .add(new BigDecimal(zavrsnaOcena))
                .add(new BigDecimal(ocenaOdbrane))
                .divide(new BigDecimal(4), 2, RoundingMode.HALF_UP);

        return result;
    }

    @Override
    public BigDecimal odrediProsekOceneNaIspitima(ArrayList<Ispit> listaIspita) {
        int sum = 0;
        int count = 0;
        for (Ispit ispit :
                listaIspita) {
            if(ispit.getOcena() > 1) {
                sum = sum + ispit.getOcena();
                count++;
            }

        }
        double prosek = (double) sum / count;
        return BigDecimal.valueOf(prosek);


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
    public ArrayList<Ispit> filtrirajIspitePoStudentu(ArrayList<Ispit> listaIspita, Student student) {
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
