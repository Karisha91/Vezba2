package hr.java.vjezbe.entitet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Glavna {

    public static void main(String[] args) {

        //UI ui = new UI();
        //.startUI();
        Profesor profesor1 = new Profesor("001", "Ivan", "Djurdjevic", "Legenda");
        Profesor profesor2 = new Profesor("002", "Marko", "Markovic", "Kralj");

        Student student1 = new Student("Nenad", "Nenadovic", "0232123123123", LocalDate.of(1992, 5,11));
        Student student2 = new Student("Marko", "Markovic", "06121991710294", LocalDate.of(1991, 6,12));

        Predmet predmet1 = new Predmet("001", "Java programiranje", 6, profesor1);
        Predmet predmet2 = new Predmet("002", "JavaScript", 6, profesor2);

        Ispit ispit1 = new Ispit(predmet1, student1, 5, LocalDateTime.of(1991, 5, 12, 15, 33));
        Ispit ispit2 = new Ispit(predmet1, student2, 1, LocalDateTime.of(1991, 5, 12, 15, 33));


        ArrayList<Profesor> listaProfesora = new ArrayList<>();
        listaProfesora.add(profesor1);
        listaProfesora.add(profesor2);
        ArrayList<Student> listaStudenata = new ArrayList<>();
        listaStudenata.add(student1);
        listaStudenata.add(student2);
        ArrayList<Predmet> listaPredmeta = new ArrayList<>();
        listaPredmeta.add(predmet1);
        listaPredmeta.add(predmet2);
        ArrayList<Ispit> listaIspita = new ArrayList<>();
        listaIspita.add(ispit1);
        listaIspita.add(ispit2);

        VeleucilisteJave vj = new VeleucilisteJave("VeleJava", listaProfesora, listaStudenata, listaPredmeta, listaIspita);


        vj.odrediProsekOceneNaIspitima(listaIspita);





    }
}


