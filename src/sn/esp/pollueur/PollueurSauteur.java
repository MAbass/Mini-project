package sn.esp.pollueur;

import sn.esp.world.Monde;

public class PollueurSauteur extends RobotPollueur {
    private final int deltax;

    public PollueurSauteur(int colDepart, int saut, Monde monde) {
        super(0, colDepart, monde);
        this.deltax = saut;

    }

    @Override
    public void parcourir() {
        int colDepart = this.posy;
//        Note: this.posy = colDepart, if (i % 2 == 0) then (0, coldepart) else (0, coldepart+this.deltax)
        for (int i = 0; i < this.m.getNbL(); i++) {
            if (i % 2 == 0) {
                vaEn(i, colDepart);
                if (!this.m.estSale(i, colDepart)) {
                    polluer();
                }
            } else {
                colDepart = colDepart + this.deltax;
                if (colDepart >= this.m.getNbC()) {
                    vaEn(i, 0);
                    if (!this.m.estSale(i, 0)) {
                        polluer();
                    }
                    colDepart = 0;
                } else {
                    vaEn(i, colDepart);
                    if (!this.m.estSale(i, colDepart)) {
                        polluer();
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "PollueurSauteur{" +
                "posx=" + posx +
                ", posy=" + posy +
                ".\n " + m +
                '}';
    }
}