package sn.esp.pollueur;

import sn.esp.robot.Robot;
import sn.esp.world.Monde;

public class PollueurSauteur extends Robot {
    private int deltax;

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
                this.m.metPapierGras(i, colDepart);

            } else {
                colDepart = colDepart + this.deltax;
                if (colDepart >= this.m.getNbC()) {
                    this.m.metPapierGras(i, 0);
                    colDepart = 0;
                } else {
                    this.m.metPapierGras(i, colDepart);
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