import java.util.Random;
import java.util.Scanner;
public class RandomClass {
    // estrarre un valore da un dado a 6 facce
    public static void main(String[] args){

        System.out.println("Il valore estratto dal Dado a 6 facce è: " + RandomClass.lanciaDado());
    }

    public static int lanciaDado(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci le facce del Dado: ");
        int n = sc.nextInt();
        Random rand = new Random();

        int randomValue = rand.nextInt(n); // [0-(n-1)]

        return 1 + randomValue;  // ritornare un valore da un dado a 6 facce;
    }
}
