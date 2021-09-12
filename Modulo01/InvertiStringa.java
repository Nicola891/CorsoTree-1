import java.util.Scanner;

public class InvertiStringa {
    /*Data una stringa, stampare la stessa stringa invertendone il contenuto a partire dal
    primo spazio, ad esempio data la stringa «come stai» stampare a video «stai come».
    Potete dare per assunto che la stringa conterrà sempre un solo spazio.
    Suggerimento: utilizzate i metodi della classe String
    Suggerimento: inserite il codice della vostra soluzione all’interno del metodo
    reverseString del codice che trovate a questo indirizzo*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a=sc.nextLine();
        reverseString(a);
    }
    private static void reverseString(String s) {
        String[] split = s.split(" ");
        System.out.println(split[1] + " " + split[0]);
    }
}
