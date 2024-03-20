import Salaires.EmployeARisque;

class ManuARisque extends Manutentionnaire implements EmployeARisque {
    public ManuARisque(String nom, String prenom, int age, String dateEntree, int heuresTravail) {
        super(nom, prenom, age, dateEntree, heuresTravail);
    }

    @Override
    public double calculerPrime() {
        return PRIME_RISQUE;
    }
}
