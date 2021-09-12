import java.util.Scanner;

public class StringReverse {
    /* Scrivere un metodo che, data una stringa s in input, ne stampi il reverse, ossia la
    stringa al contrario. Esempio: data la stringa «ciao», dovrà stampare «oaic». */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        stringReverse(a);
    }

    static void stringReverse(String s) {
        //inserite qui il vostro codice
        String invertita = "";
        for (int i = s.length()-1;i >= 0; i--) {
            invertita = invertita + s.charAt(i);

        }
        System.out.println(invertita);
    }
}
