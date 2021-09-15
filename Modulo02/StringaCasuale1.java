import java.util.Random;

public class StringaCasuale1 {

    public static void main(String[] args) {

        String[] random = {"Andrea","Marco","Melvin"};

        System.out.println(stringaCasuale1(random));
    }

    public static String stringaCasuale1(String[] random){

        int lunghezza = random.length; // lunghezza array random
        Random rand = new Random();
        int randomValue = rand.nextInt(lunghezza); // [0-2]
        double a = randomValue+rand.nextGaussian();
        int b= (int)Math.round(a);

        //if(a<0 && a>(lunghezza-1))
        if(a<0) {
            System.out.println("Valore non appartenente al range: " + a);
            //return random[0];
            b = 0;
            //return "Condizone non rispettata";

        }else if(a>lunghezza-1) {
            System.out.println("Valore non appartenente al range: " + a);
            //return random[2];
            b = lunghezza - 1;
            //return "Condizone non rispettata";
        }

        System.out.println("Numero approssimato: " + b);
        System.out.println("Valore Gaussiano: " + a);
        System.out.println ("Posizione Array: " + randomValue);

        return random[b];
    }
}

