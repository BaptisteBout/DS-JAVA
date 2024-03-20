package Salaires;

public interface EmployeARisque {
    double PRIME_RISQUE = 200.0; // Prime mensuelle fixe pour les employés à risque

    double calculerPrime(); // Méthode pour calculer la prime de risque
}