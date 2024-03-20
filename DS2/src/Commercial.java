import Salaires.Employe;

abstract class Commercial extends Employe {
    public Commercial(String nom, String prenom, int age, String dateEntree) {
        super(nom, prenom, age, dateEntree);
    }

    public abstract double calculerSalaire();

    public String getTitre() {
        return "Je suis un commercial !";
    }
}
