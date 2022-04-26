package sn.esp.nettoyeur;

import sn.esp.nettoyeur.robot.Robot;
import sn.esp.world.Monde;

public class RobotNettoyeur extends Robot {
    //constructeur

    public RobotNettoyeur (int posx,int posy,Monde m)  {
        super(0, 0, m); 
    }

    public void parcourir(){};
    

    public void nettoyer() {
        m.prendPapierGras(posx,posy);
    }    
}
