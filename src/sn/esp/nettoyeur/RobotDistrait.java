package sn.esp.nettoyeur;

import sn.esp.world.Monde;

public class RobotDistrait extends RobotNettoyeur {
    public RobotDistrait(Monde monde) {
        super(monde);
    }

    @Override
    public void parcourir() {
        /*for (int i = 0; i < this.m.getNbL(); i++) {
            for (int j = 0; j < this.m.getNbC(); j++) {
                int colVariable = this.m.getNbC() - j - 1;
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        vaEn(i, j);
                        if (this.m.estSale(i, j)) {
                            this.nettoyer();
                        }
                    }
                } else {
                    if (colVariable % 2 != 0) {
                        vaEn(i, colVariable);
                        if (this.m.estSale(i, colVariable)) {
                            this.nettoyer();
                        }
                    }
                }

            }
        }*/
        int cmpt = 0;
        for (int i = 0; i < this.m.getNbL(); i++) {
            for (int j = 0; j < this.m.getNbC(); j++) {
                if (i % 2 == 0) {
                    vaEn(i, j);
                    if (this.m.estSale(i, j)) {
                        if ((cmpt % 2) == 0) {
                            this.m.prendPapierGras(this.posx, this.posy);
                        }
                        cmpt++;
                    }
                } else {
                    vaEn(i, this.m.getNbC() - j - 1);
                    if (this.m.estSale(i, this.m.getNbC() - j - 1)) {
                        if ((cmpt % 2) == 0) {
                            this.m.prendPapierGras(this.posx, this.posy);
                        }
                        cmpt++;
                    }
                }
            }
        }
    }
}
