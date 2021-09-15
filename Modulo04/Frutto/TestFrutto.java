package Frutto;

public class TestFrutto {
    public static void main(String[] args) {

        Pesca pesca = new Pesca(Colore.BIANCO, false);
        System.out.println(pesca.getColore());

        Pera pera = new Pera(Colore.VERDE, true);
        System.out.println(pera.contaSemi());

        Frutto[] frutti = new Frutto[2];
        frutti[0]=pesca;
        frutti[1]=pera;
        mangia(pesca);
        mangia(pera);
    }

    public static void mangia(Frutto f) {

        System.out.println("Ho mangiato un frutto di colore: " + f.getColore());

    }
}
