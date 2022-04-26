package sn.esp.world;

public class Monde {
    protected final boolean[][] matrice;
    protected int nbL;
    protected int nbC;

    public Monde() {
        this.nbC = 10;
        this.nbL = 10;
        this.matrice = new boolean[this.nbL][this.nbC];
    }

    public Monde(int nbL, int nbC) {
        this.nbL = Math.abs(nbL);
        this.nbC = Math.abs(nbC);
        this.matrice = new boolean[this.nbL][this.nbC];
    }

    public void metPapierGras(int i, int j) {
        if (i >= this.nbL) {
            i = this.nbL - 1;
        }
        if (j >= this.nbC) {
            j = this.nbC - 1;
        }
//        System.out.println("Papier gras au:(" + i + "," + j + ")");
        matrice[i][j] = true;
    }

    public void prendPapierGras(int i, int j) {
        if (i >= this.nbL) {
            i = this.nbL - 1;
        }
        if (j >= this.nbC) {
            j = this.nbC - 1;
        }
//        System.out.println("Enlevez du papier gras au:(" + i + "," + j + ")");

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
        StringBuilder monde = new StringBuilder();
        for (int i = 0; i < nbL; i++) {
            for (int j = 0; j < nbC; j++) {
                if (this.matrice[i][j]) {
                    monde.append("o\t");
                } else {
                    monde.append(".\t");
                }
            }
            monde.append("\n");
        }
        return "Le monde a " + this.nbL + " de lignes et " + this.nbC + " de colonnes.\n On a " + this.nbPapierGras() +
                " de papier gras dans ce monde.\n" + monde;
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
