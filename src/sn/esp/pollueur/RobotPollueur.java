package sn.esp.pollueur;

import sn.esp.nettoyeur.robot.Robot;
import sn.esp.world.Monde;

public class RobotPollueur extends Robot{
    
    private int posx;
    private int posy;
   
        //constructeur

    public RobotPollueur (int x,int y,Monde m)  {
       super(x, y, m); 
    }

    public RobotPollueur (Monde m){
        super(m);
    }
    public void setposx(int posx) {
        this.posx = posx;
    }

    public int getposx() {
        return posx;
    }

    public void setposy(int posy) {
        this.posy = posy;
    }

    public int getposy() {
        return posy;
    }

    public void polluer() {
        m.metPapierGras(posx,posy);
    }
   public void parcourir() {}

}

