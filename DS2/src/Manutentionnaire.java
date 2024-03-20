import Salaires.Employe;

public class Manutentionnaire extends Employe {
    private int heuresTravail;

    public Manutentionnaire(String nom, String prenom, int age, String dateEntree, int heuresTravail) {
        super(nom, prenom, age, dateEntree);
        this.heuresTravail = heuresTravail;
    }

    public double calculerSalaire() {
        return heuresTravail * 65;
    }

    public String getTitre() {
        return "Je suis un manutentionnaire !";
    }
}
