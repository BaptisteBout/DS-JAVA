import Salaires.Employe;

class Technicien extends Employe {
    private int nombreUnites;

    public Technicien(String nom, String prenom, int age, String dateEntree, int nombreUnites) {
        super(nom, prenom, age, dateEntree);
        this.nombreUnites = nombreUnites;
    }

    public double calculerSalaire() {
        return nombreUnites * 5;
    }

    public String getTitre() {
        return "Je suis un technicien !";
    }
}
