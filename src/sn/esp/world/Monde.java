package sn.esp.world;

public class Monde {
    private int nbL;
    private int nbC;
    private boolean mat[][];

    // constructeur sans paramètres
    public Monde() {
        this.mat = new boolean[10][10];
    }

    // constructeur avec paramètres
    public Monde(int nbC, int nbL) {
        this.nbC = nbC;
        this.nbL = nbL;
    }

    public void setnbL(int nbL) {
        this.nbL = nbL;
    }

    public void setnbC(int nbC) {
        this.nbC = nbC;
    }

    public int getnbL() {
        return nbL;
    }

    public int getnbC() {
        return nbC;
    }

    public String toString() {
        String output = new String();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                output += mat[nbC][nbL] ? "o \t" : ". lt";
            }
            output += "\n";
        }
        return output;
    }

    public void metPapierGras(int i, int j) {
        mat[i][j] = true;
    }

    public void prendPapierGras(int i, int j) {
        mat[i][j] = false;
    }

    public void estSale(int i, int j) {
        if (mat[i][j] == false) {
            System.out.println("La case a un papier gras");
        }

    }

    public void nbPapiersGras() {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; i < mat[i].length; j++) {
                if (mat[i][j] == true)
                    count++;
            }
        }
        System.out.println("Il y a" +count+ "papier gras dans le monde");
    }
}
