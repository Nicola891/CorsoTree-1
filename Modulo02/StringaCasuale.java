import java.util.Random;

public class StringaCasuale {
    public static void main(String[] args) {

        Random rand = new Random();

        String[] random = {"Andrea","Marco","Melvin"};

        int lunghezza = random.length; // lunghezza array random

        int randomValue = rand.nextInt(lunghezza); // [0-2]

        System.out.println(StringaCasuale.stringaCasuale(random,randomValue));


    }

    public static String stringaCasuale(String[] random, int randomValue){

        return random[randomValue];
    }

}


