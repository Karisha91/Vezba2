package hr.java.vjezbe.entitet;
import hr.java.vjezbe.entitet.Ispit;
import hr.java.vjezbe.entitet.Predmet;
import hr.java.vjezbe.entitet.Profesor;
import hr.java.vjezbe.entitet.Student;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UI {

    private int OcenaZavrsnog;

    private int OcenaOdbrane;

    private Scanner scanner;
    private ArrayList<Profesor> listaProfesora;

    private ArrayList<Predmet> listaPredmeta;

    private ArrayList<Student> listaStudenata;

    private ArrayList<Ispit> listaIspita;

    private ArrayList<ObrazovnaUstanova> listaObrazovnihUstanova;

    private ArrayList<Integer> listaOcena;

    public UI() {
        this.scanner = new Scanner(System.in);
        this.listaProfesora = new ArrayList<>();
        this.listaPredmeta = new ArrayList<>();
        this.listaStudenata = new ArrayList<>();
        this.listaIspita = new ArrayList<>();
        this.listaObrazovnihUstanova = new ArrayList<>();
        this.listaOcena = new ArrayList<>();


    }
    public void startUI(){

        while (true) {
            System.out.println("Odaberite opciju: ");
            System.out.println("1. Unesite profesora:");
            System.out.println("2. Unesite predmet:");
            System.out.println("3. Unesite studenta");
            System.out.println("4. Unesite ispitni rok:");
            System.out.println("5. Unesite obrazovnu ustanovu: ");
            System.out.println("6. Izadji");
            String answer = scanner.nextLine();
            if (answer.equals("1")){
                unosProfesora();
            }
            if (answer.equals("2")) {
                unosPredmet();
            }
            if (answer.equals("3")) {
                unosStudenta();
            }

            if (answer.equals("4")) {
                unosIspita();
            }

            if (answer.equals("5")) {
                unosUstanove();
            }

            if (answer.equals("6")) {
                break;
            }

        }
    }
    private void unosProfesora() {

        System.out.print("Unesite sifru profesora: ");
        String sifra = scanner.nextLine();

        System.out.print("Unesite ime profesora: ");
        String ime = scanner.nextLine();

        System.out.print("Unesite prezime profesora: ");
        String prezime = scanner.nextLine();

        System.out.print("Unesite titulu profesora: ");
        String titula = scanner.nextLine();

        Profesor profesor = new Profesor(sifra, ime ,prezime ,titula);
        listaProfesora.add(profesor);

    }
    private void unosPredmet(){

        System.out.print("Unesite sifru predmeta: ");
        String sifra = scanner.nextLine();

        System.out.print("Unesite naziv predmeta: ");
        String naziv = scanner.nextLine();

        System.out.print("Unesite broj ECTS bodova za predmet "  + naziv + ":");
        int ocena = scanner.nextInt();
        System.out.println("Odaberite profesora: ");
        for (int i = 0; i < listaProfesora.size(); i++) {
            System.out.println((i + 1) + ". " + listaProfesora.get(i));
        }
        scanner.nextLine();
        System.out.println("Odabir: ");
        String odabir = scanner.nextLine();


        Profesor profesor = listaProfesora.get(Integer.parseInt(odabir) - 1);
        System.out.println("Izabrali ste -> " + profesor);

        System.out.print("Unesite broj studenata za predmet: " + naziv + ":");
        int brojStudenata = scanner.nextInt();
        scanner.nextLine();

        Predmet predmet = new Predmet(sifra, naziv, ocena, profesor);
        listaPredmeta.add(predmet);
    }

    private void unosStudenta(){

        System.out.print("Unesite ime studenta: ");
        String ime = scanner.nextLine();

        System.out.print("Unesite prezime studenta: ");
        String prezime = scanner.nextLine();

        System.out.print("Unesite datum rodjenja " + ime + " " + prezime + "u formatu yyyy.MM.dd: " );
        String datumString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate datumRodjenja = LocalDate.parse(datumString, formatter);

        System.out.print("Unesite JMBG studenta " + ime + " " + prezime + ": ");
        String jmbg = scanner.nextLine();

        Student student = new Student(ime, prezime ,jmbg, datumRodjenja);
        listaStudenata.add(student);
    }
    private void unosIspita(){

        System.out.println("Odaberite predmet: ");
        for (int i = 0; i < listaPredmeta.size(); i++) {
            System.out.println((i + 1) + ". " + listaPredmeta.get(i));
        }
        System.out.println("Odabir: ");
        String odabir = scanner.nextLine();

        Predmet predmet = listaPredmeta.get(Integer.parseInt(odabir) - 1);
        System.out.println("Izabrali ste -> " + predmet);
        System.out.println("");
        System.out.println("Izaberite studenta: ");
        for (int i = 0; i < listaStudenata.size(); i++) {
            System.out.println((i + 1) + ". " + listaStudenata.get(i));
        }
        System.out.println("Odabir: ");
        String odabirS = scanner.nextLine();

        Student student = listaStudenata.get(Integer.parseInt(odabirS) - 1);
        System.out.println("Izabrali ste -> " + student);

        System.out.println("Unesite ocenu na ispitu (1-5):");
        int ocena = scanner.nextInt();
        scanner.nextLine();

        LocalDateTime datumIVreme;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.'T'HH:mm");
        while (true) {
            try {
                System.out.println("Unesite datum i vreme ispita u formatu dd.MM.yyyy.THH:mm ");
                String datumString = scanner.nextLine();
                datumIVreme = LocalDateTime.parse(datumString, formatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println(" Molimo koristite format dd.MM.yyyy.THH:mm");
            }
        }
        Ispit ispit = new Ispit(predmet, student, ocena, datumIVreme);
        this.listaIspita.add(ispit);
        System.out.println("ispit dodat");
        System.out.println("Student " + student.getIme() + " " + student.getPrezime() + " je ostvario ocenu " + ocena(ocena) + " na predmetu " + predmet.getNaziv() + ".");
    }

    public void unosUstanove() {
        System.out.println("Unesite broj obrazovnih ustanova: ");
        int broj = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Unesite podatke za obrazovnu ustanovu:");

        for (int i = 0; i < broj; i++) {
            System.out.println("Unesite "+ (i + 1) +". profesora:");
            unosProfesora();
        }
        for (int i = 0; i < broj; i++) {
            System.out.println("Unesite "+ (i + 1) +". studenta:");
            unosStudenta();
        }
        for (int i = 0; i < broj; i++) {
            System.out.println("Unesite "+ (i + 1) +". predmet:");
            unosPredmet();
        }

        for (int i = 0; i < broj; i++) {
            System.out.println("Unesite "+ (i + 1) +". ispit:");
            unosIspita();
        }


        ArrayList<Profesor> prof = this.listaProfesora;
        ArrayList<Student> stud = this.listaStudenata;
        ArrayList<Predmet> pred = this.listaPredmeta;
        ArrayList<Ispit> ispit = this.listaIspita;

        System.out.println("Odaberite obrazovnu ustanovu za koju zelite da unesete podatke: '\n'" +
                "1. Veleuciliste java '\n'" +
                "2. Fakultet racunarstva");

        int odabir = scanner.nextInt();
        scanner.nextLine();
        if (odabir == 1) {
            System.out.println("Unesite naziv Obrazovne Ustanove:");
            String naziv = scanner.nextLine();
            VeleucilisteJave ou = new VeleucilisteJave(naziv, prof, stud, pred, ispit);
            listaObrazovnihUstanova.add(ou);
            for (int i = 0; i < broj; i++) {
                System.out.println("Unesite ocenu zavrsnog rada za studenta: " + listaStudenata.get(i));
                int ocenaZavrsnog = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Unesite ocenu odbrane zavrsnog rada za studenta: " + listaStudenata.get(i));
                int ocenaOdbrane = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Konacna ocena studija za studenta " + listaStudenata.get(i) + " je " +
                        ou.izracunajKonacnuOcenuStudijaZaStudenta(listaIspita, ocenaZavrsnog, ocenaOdbrane));
            }






        }

        if (odabir == 2) {

            System.out.println("Unesite naziv Obrazovne Ustanove:");
            String naziv = scanner.nextLine();
            ObrazovnaUstanova ou = new FakultetRacunarstva(naziv, prof, stud, pred, ispit);
            listaObrazovnihUstanova.add(ou);
        }

        for (int i = 0; i < listaObrazovnihUstanova.size(); i++) {
            System.out.println((i + 1) + ". " + listaObrazovnihUstanova.get(i));
        }



    }
    private String ocena(int ocena){
        if (ocena <1 || ocena > 5) {
            throw new IllegalArgumentException("Ocena mora biti od 1-5");
        }
        if (ocena == 1) {
            return "nedovoljan";
        }
        if (ocena == 2) {
            return "Dovoljan";
        }
        if (ocena == 3) {
            return "Dobar";
        }
        if (ocena == 4) {
            return "vrlo dobar";
        } else {
            return "odlican";
        }
    }
    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }
}

