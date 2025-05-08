package hr.java.vjezbe.entitet;

import java.util.ArrayList;


public abstract class ObrazovnaUstanova {

    private String nazivUstanove;
    private ArrayList<Profesor> listaProfesora;

    private ArrayList<Student> listaStudenata;

    private ArrayList<Predmet> listaPredmeta;

    private ArrayList<Ispit> listaIspita;



    protected ObrazovnaUstanova(String nazivUstanove, ArrayList<Profesor> listaProfesora,
                                ArrayList<Student> listaStudenata, ArrayList<Predmet> listaPredmeta,
                                ArrayList<Ispit> listaIspita) {
        this.nazivUstanove = nazivUstanove;
        this.listaProfesora = listaProfesora;
        this.listaStudenata = listaStudenata;
        this.listaPredmeta = listaPredmeta;
        this.listaIspita = listaIspita;

    }
    public Student odrediNajuspesnijegStudentaNaGodini(int godina){

        return null;
    }

    public String getNazivUstanove() {
        return nazivUstanove;
    }

    public ArrayList<Profesor> getListaProfesora() {
        return listaProfesora;
    }

    public ArrayList<Student> getListaStudenata() {
        return listaStudenata;
    }

    public ArrayList<Predmet> getListaPredmeta() {
        return listaPredmeta;
    }
}
