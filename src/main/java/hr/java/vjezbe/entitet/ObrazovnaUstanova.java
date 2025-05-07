package hr.java.vjezbe.entitet;

public abstract class ObrazovnaUstanova {

    private String nazivUstanove;
    private Profesor profesor;
    private Student student;
    private Predmet predmet;


    protected ObrazovnaUstanova(String nazivUstanove, Profesor profesor, Student student, Predmet predmet) {
        this.nazivUstanove = nazivUstanove;
        this.profesor = profesor;
        this.student = student;
        this.predmet = predmet;

    }
    public Student odrediNajuspesnijegStudentaNaGodini(){

        return null;
    }

    public String getNazivUstanove() {
        return nazivUstanove;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Student getStudent() {
        return student;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setNazivUstanove(String nazivUstanove) {
        this.nazivUstanove = nazivUstanove;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }
}
