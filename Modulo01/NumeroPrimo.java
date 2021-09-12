public class NumeroPrimo {
    //Scrivere un metodo che, dato in input un intero a, ritorni true se il numero è primo false altrimenti.
    //Altro suggerimento: un numero si dice «primo» se è divisibile solo per sé stesso e per 1
    public static void main(String[] args) {
        int number = 0;
        System.out.println(isPrime(number));
        number = 1;
        System.out.println(isPrime(number));
        number = 2; //si
        System.out.println(isPrime(number));
        number = 17; //si
        System.out.println(isPrime(number));
        number = 631; //si
        System.out.println(isPrime(number));
        number = 634; //no
        System.out.println(isPrime(number));
        number = 999; //no
        System.out.println(isPrime(number));
        number = 997; //si
        System.out.println(isPrime(number));
    }

    // il metodo isPrime controlla se un numero è primo scorrendo tutti i numeri minori del numero che stiamo
    // considerando (number) e controllando se il resto della divisione tra numero (number) e il numero corrente i
    // è uguale a 0.
    // Nel caso in cui resto è uguale a 0, il numero ha un divisore oltre a 1 (non primo).
    // I casi dove il numero è minore di 2 (non primo).

    private static boolean isPrime(int number) {
        //inserite qui il vostro codice

        if(number<2)
            return false;

        for (int i=2; i<number; i++) {
            if (number%i==0)
                return false;
        }

        return true;
    }

}
