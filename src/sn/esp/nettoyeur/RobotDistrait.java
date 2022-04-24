package sn.esp.nettoyeur;

import sn.esp.robot.Robot;
import sn.esp.world.Monde;

public class RobotDistrait extends Robot {
    public RobotDistrait(Monde monde) {
        super(0, 0, monde);
    }

    @Override
    public void parcourir() {
        for (int i = 0; i < this.m.getNbL(); i++) {
            for (int j = 0; j < this.m.getNbC(); j++) {
                int colVariable = this.m.getNbC() - j - 1;
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        this.m.prendPapierGras(i, j);
                    }
                } else {
                    if (colVariable % 2 != 0) {
                        this.m.prendPapierGras(i, colVariable);
                    }
                }

            }
        }
    }
}
