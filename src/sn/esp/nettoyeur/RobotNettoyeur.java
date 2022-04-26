package sn.esp.nettoyeur;

import sn.esp.robot.Robot;
import sn.esp.world.Monde;

public class RobotNettoyeur extends Robot {
    public RobotNettoyeur(Monde monde) {
        super(0, 0, monde);
    }

    public void nettoyer() {
        this.m.prendPapierGras(this.posx, this.posy);
    }

    @Override
    public void parcourir() {
        for (int i = 0; i < this.m.getNbL(); i++) {
            for (int j = 0; j < this.m.getNbC(); j++) {
                if (i % 2 == 0) {
                    vaEn(i, j);
                    if (this.m.estSale(i, j)) {
                        nettoyer();
                    }
                } else {
                    vaEn(i, this.m.getNbC() - j - 1);
                    if (this.m.estSale(i, this.m.getNbC() - j - 1)) {
                        nettoyer();
                    }
                    nettoyer();

                }

            }
        }

    }
}
