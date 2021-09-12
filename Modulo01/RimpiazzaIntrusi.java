import java.util.Scanner;

public class RimpiazzaIntrusi {

    /*Date tre stringhe a, b e c in input, stampare c dopo aver rimpiazzato, all’interno di c,
    ogni occorrenza compresa tra due spazi di a con b. Ad esempio, date in input le
    stringhe «a», «b», «a abc d», stampare a video «a bbc d». Potete dare per assunto che la
    stringa c conterrà sempre e solo due spazi. */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:"); // stringa iniziale
        String a=sc.nextLine();
        System.out.print("Enter string:"); // cosa devo cercare
        String b=sc.nextLine();
        System.out.print("Enter string:"); // cosa devo rimpiazzare
        String c=sc.nextLine();
        replaceIntruder(a, b, c);
    }

    private static void replaceIntruder(String a, String b , String c) {
        //inserite qui il vostro codice
        String[] split= a.split(" ");
        String target = split[1];
        String targetrimpiazzato = target.replaceAll(b,c);
        String risultato = split[0]+" "+targetrimpiazzato+" "+split[2];
        System.out.println(risultato);


    }

}
