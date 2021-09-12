import java.util.Scanner;

public class ContaOccorrenze {
    /* Scrivere un metodo che, dato un char a e una stringa b, stampa il numero di
       occorrenze di a in b. */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter character a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b =sc.nextLine();
        countOccurrences(a.charAt(0), b);
    }

    static void countOccurrences(char a, String b) {
        //inserite qui il vostro codice
        int conta = 0;
        /*for(int i=0; i<b.length(); i++){

            char risultato = b.charAt(i);*/
        for (char risultato : b.toCharArray()) {

            if(risultato==a){
                conta++; // contatore
            }

        }

        System.out.println(conta);
    }



}
