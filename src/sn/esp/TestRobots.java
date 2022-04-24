package sn.esp;

import sn.esp.nettoyeur.RobotDistrait;
import sn.esp.nettoyeur.RobotNettoyeur;
import sn.esp.pollueur.PollueurSauteur;
import sn.esp.pollueur.PollueurToutDroit;
import sn.esp.pollueur.RobotPollueur;
import sn.esp.world.Monde;

public class TestRobots {
    public static void main(String[] args) {
        Monde monde = new Monde(10, 7);
        System.out.println("--------Placez des papiers gras--------");
        monde.metPapierGras(1, 1);
        monde.metPapierGras(3, 7);
        monde.metPapierGras(2, 4);
        monde.metPapierGras(3, 5);
        monde.metPapierGras(10, 3);
        monde.metPapierGras(3, 2);
        monde.metPapierGras(8, 2);

        System.out.println("--------Verifiez si une case est sale ou pas--------");
        System.out.println("La case(0,0) est:" + (monde.estSale(0, 0) ? "sale" : "propre"));
        System.out.println("La case(0,1) est:" + (monde.estSale(0, 1) ? "sale" : "propre"));
        System.out.println("La case(3,3) est:" + (monde.estSale(3, 3) ? "sale" : "propre"));
        System.out.println("La case(10,3) est:" + (monde.estSale(10, 3) ? "sale" : "propre"));
        System.out.println("La case(8,2) est:" + (monde.estSale(8, 2) ? "sale" : "propre"));
        System.out.println("La case(8,3) est:" + (monde.estSale(8, 3) ? "sale" : "propre"));

        System.out.println("--------Donnez le nombre de cases comportant de papier gras--------");
        System.out.println("Nombre de cases comportant de papier gras:" + monde.nbPapierGras());

        System.out.println("--------Enlevez quelques papier gras--------");
        monde.prendPapierGras(0, 0);
        monde.prendPapierGras(0, 1);
        monde.prendPapierGras(3, 2);

        System.out.println("--------Reverifiez nombre de cases comportant de papier gras--------");
        System.out.println("Aprés verification, on a:" + monde.nbPapierGras());

        System.out.println("--------Décrivons notre monde--------");
        System.out.println(monde);

        System.out.println("--------Verifions quel sera notre monde si le robot pollueur pollue notre monde--------");
        RobotPollueur robotPollueur = new RobotPollueur(1, 1, monde);
        robotPollueur.polluer();
        System.out.println(monde);

        System.out.println("--------Verifions quel sera notre monde si le robot sauteur pollue notre monde--------");
        PollueurSauteur pollueurSauteur = new PollueurSauteur(1, 3, monde);
        pollueurSauteur.parcourir();
        System.out.println(monde);

        System.out.println("--------Verifions quel sera notre monde si le robot tout droit pollue notre monde--------");
        PollueurToutDroit pollueurToutDroit = new PollueurToutDroit(3, monde);
        pollueurToutDroit.parcourir();
        System.out.println(monde);

       /* System.out.println("--------Verifions quel sera notre monde si le robot nettoyeur passe sur notre monde--------");
        RobotNettoyeur robotNettoyeur = new RobotNettoyeur(monde);
        robotNettoyeur.parcourir();
        System.out.println(monde);*/

        System.out.println("--------Verifions quel sera notre monde si le robot distrait passe sur notre monde--------");
        RobotDistrait robotDistrait = new RobotDistrait(monde);
        robotDistrait.parcourir();
        System.out.println(monde);


    }
}
