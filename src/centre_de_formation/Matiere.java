package centre_de_formation;

enum Matiere {

    JAVA("JAVA", 12, 400, 200, 6),
    APEX("APEX", 13, 400, 200, 6),
    UML("UML", 14, 400, 200, 4),
    SQL("SQL", 15, 400, 200, 3);

    private String nom;
    private int code;
    private int nbHeures;
    private int cout;
    private float coeffecient;


    private Matiere(String nom, int code, int nbHeures, int cout, float coeffecient) {
        this.nom = nom;
        this.code = code;
        this.nbHeures = nbHeures;
        this.cout = cout;
    }

    public float getCoeffecient() {
        return coeffecient;
    }
}

