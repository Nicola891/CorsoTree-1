package Contatore;

import java.util.Scanner;

public class TestContatore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double valore = s.nextDouble();
        Contatore c = new Contatore(valore); // passiamo un valore iniziale
        System.out.println(c.getValoreAttuale());
        //c.setValoreAttuale(10);
        c.incrementa();
        c.incrementa(2);
        System.out.println(c.getValoreAttuale());
        c.resetAZero();
        System.out.println(c.getValoreAttuale());
    }
}
