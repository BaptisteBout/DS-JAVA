class Vendeur extends Commercial {
    private double chiffreAffaire;

    public Vendeur(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double calculerSalaire() {
        return chiffreAffaire * 0.2 + 400;
    }
}
