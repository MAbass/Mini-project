package sn.esp.pollueur;

import sn.esp.robot.Robot;
import sn.esp.world.Monde;

public class RobotPollueur extends Robot {

    public RobotPollueur(int posx, int posy, Monde m) {
        super(posx, posy, m);
    }

    public void polluer() {
        this.m.metPapierGras(this.posx, this.posy);
    }

    @Override
    public void parcourir() {

    }
}
