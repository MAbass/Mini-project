package sn.esp.pollueur;

import sn.esp.world.Monde;

public class PollueurToutDroit extends RobotPollueur {
    private final int colDepart;
    private final int nbColonneDestinate;

    public PollueurToutDroit(int colDepart, Monde monde) {
        super(0, colDepart, monde);
        this.colDepart = colDepart;
        this.nbColonneDestinate = monde.getNbL();
    }

    @Override
    public void parcourir() {
        for (int i = 0; i < this.nbColonneDestinate; i++) {
            vaEn(i, this.colDepart);
            if (!this.m.estSale(i, this.colDepart)) {
                polluer();
            }
        }
    }
}
