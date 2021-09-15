import java.util.Random;
import java.util.Scanner;

public class TrovaNumeriPrimi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un numero N: ");
        int n = sc.nextInt();

        System.out.println("I numeri primi fino a N sono: ");
        trovaNumeroPrimo(n);
    }

    public static void trovaNumeroPrimo(int n){

        Random rand = new Random();

        for(int i=1; i<=n; i++){
            int randomValue = 1 + rand.nextInt(n); // [1,n]
            if(randomValue%2 != 0) {
                System.out.println(randomValue);
            }
        }

    }

}
