class Representant extends Commercial {
    private double chiffreAffaire;

    public Representant(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double calculerSalaire() {
        return chiffreAffaire * 0.2 + 800;
    }
}
