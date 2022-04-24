package sn.esp.robot;

import sn.esp.world.Monde;

public abstract class Robot {
    protected int posx;
    protected int posy;
    protected Monde m;

    public Robot(int posx, int posy, Monde m) {
        this.posx = posx;
        this.posy = posy;
        this.m = m;
    }

    public Robot(Monde m) {
        this((int) (Math.random() * (m.getNbL() - 1)) + 1, (int) (Math.random() * (m.getNbC() - 1)) + 1, m);
    }

    public void vaEn(int i, int j) {
        this.posx = i;
        this.posy = j;
    }

    public abstract void parcourir();

    @Override
    public String toString() {
        return "Robot{" +
                "posx=" + posx +
                ", posy=" + posy +
                ".\n" + m +
                '}';
    }
}
