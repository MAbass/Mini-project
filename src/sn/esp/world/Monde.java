package sn.esp.world;

public class Monde {
    private int nbL;
    private int nbC;
    private final boolean[][] matrice;

    public Monde() {
        this.nbC = 10;
        this.nbL = 10;
        this.matrice = new boolean[this.nbL][this.nbC];
    }

    public Monde(int nbL, int nbC) {
        this.nbL = nbL;
        this.nbC = nbC;
        this.matrice = new boolean[this.nbL][this.nbC];
    }

    public void metPapierGras(int i, int j) {
        if (i >= this.nbL) {
            i = this.nbL - 1;
        }
        if (j >= this.nbC) {
            j = this.nbC - 1;
        }
        System.out.println("Papier gras au:(" + i + "," + j + ")");
        matrice[i][j] = true;
    }

    public void prendPapierGras(int i, int j) {
        if (i >= this.nbL) {
            i = this.nbL - 1;
        }
        if (j >= this.nbC) {
            j = this.nbC - 1;
        }
        System.out.println("Enlevez du papier gras au:(" + i + "," + j + ")");

        matrice[i][j] = false;
    }

    public boolean estSale(int i, int j) {
        if (i >= this.nbL) {
            i = this.nbL - 1;
        }
        if (j >= this.nbC) {
            j = this.nbC - 1;
        }
        return matrice[i][j];
    }

    public int nbPapierGras() {
        int nbPapier = 0;
        for (int i = 0; i < this.nbL; i++) {
            for (int j = 0; j < this.nbC; j++) {
                if (this.matrice[i][j]) {
                    nbPapier++;
                }
            }
        }
        return nbPapier;
    }


    @Override
    public String toString() {
        print2D(this.matrice);
        return "Le monde a " + this.nbL + " de lignes et " + this.nbC + " de colonnes.\n On a " + this.nbPapierGras() +
                " de papier gras dans ce monde.\n";
    }

    public static void print2D(boolean[][] matrice) {
        for (boolean[] row : matrice) {
            for (boolean elem : row) {
                if (elem) {
                    System.out.print("o\t");
                } else {
                    System.out.print("x\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getNbL() {
        return nbL;
    }

    public void setNbL(int nbL) {
        this.nbL = nbL;
    }

    public int getNbC() {
        return nbC;
    }

    public void setNbC(int nbC) {
        this.nbC = nbC;
    }
}
