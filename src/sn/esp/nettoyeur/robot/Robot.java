package sn.esp.nettoyeur.robot;

import sn.esp.world.Monde;

public abstract class Robot {
    protected int posx;
    protected int posy;
    protected Monde m;

     protected Robot(int posx, int posy, Monde m) {
        this.posx = posx;
        this.posy = posy;
        this.m = m; 
    }

     protected Robot (Monde m){
        
    }

    public void vaEn(int i, int j) {
        posx=i;
        posy=j;   
    }
    public abstract void parcourir();
    
}
