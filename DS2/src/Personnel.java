import Salaires.Employe;

import java.util.ArrayList;

public class Personnel {
    private ArrayList<Employe> listeEmployes;

    public Personnel() {
        listeEmployes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    public void calculerSalaires() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe.getNom() + " : " + employe.calculerSalaire());
        }
    }

    public double salaireMoyen() {
        if (listeEmployes.isEmpty()) {
            return 0.0;
        }

        double totalSalaires = 0.0;
        for (Employe employe : listeEmployes) {
            totalSalaires += employe.calculerSalaire();
        }

        return totalSalaires / listeEmployes.size();
    }
}
