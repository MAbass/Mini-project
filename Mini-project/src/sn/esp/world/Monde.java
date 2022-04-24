package sn.esp.world;

public class Monde {
    private int nbL;
    private int nbC;
    private boolean[][] mat = new boolean[nbL][nbC];

    public Monde(int nbL, int nbC, boolean[][] mat){
        this.nbL = nbL;
        this.nbC = nbC;
        this.mat = mat;
    }
    public Monde(){
        this.nbL = 10;
        this.nbC = 10;
    }
    
}
