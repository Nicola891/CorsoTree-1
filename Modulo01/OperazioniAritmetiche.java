import java.util.Scanner;
public class OperazioniAritmetiche {
    /*Scrivere un programma Java che permetta all’utente di inserire due numeri interi e,
      successivamente, stampi a video il risultato di addizione, sottrazione, moltiplicazione
      e divisione tra i due numeri.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        computeValues(a, b);

    }

    private static void computeValues(int a, int b) {
        int somma, sottrazione, moltiplicazione, divisione;
        somma = a+b;
        sottrazione = a-b;
        moltiplicazione = a*b;
        divisione = a/b;
        System.out.println(somma);
        System.out.println(sottrazione);
        System.out.println(moltiplicazione);
        System.out.println(divisione);


    }

}

