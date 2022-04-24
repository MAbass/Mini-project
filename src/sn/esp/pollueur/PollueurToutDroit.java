package sn.esp.pollueur;

import sn.esp.robot.Robot;
import sn.esp.world.Monde;

public class PollueurToutDroit extends Robot {
    private int colDepart;
    private final int nbColonneDestinate;

    public PollueurToutDroit(int colDepart, Monde monde) {
        super(0, colDepart, monde);
        this.colDepart = colDepart;
        this.nbColonneDestinate = monde.getNbL();
    }

    @Override
    public void parcourir() {
        for (int i = 0; i < this.nbColonneDestinate; i++) {
            this.m.metPapierGras(i, this.colDepart);
        }
    }
}
