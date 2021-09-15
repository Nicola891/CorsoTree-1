import java.util.Scanner;
public class GiorniOreMinutiSecondi {
    /* Scrivete una funzione che dato in input un numero di secondi, restituisce una stringa che dice
       «Giorni: numero di giorni, Ore: numero di ore etc…» */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Inserisci secondi: ");

        long secondi = sc.nextLong();

        System.out.println(tempo(secondi));

    }
    private static String tempo(long secondi){

        long giorni = secondi / 86400;
        long rGiorni = secondi % 86400;
        long ore = rGiorni / 3600;
        long rOre = rGiorni % 3600;
        long minuti = rOre / 60;
        long rMinuti = rOre % 60;
        long secondiFinali = rMinuti;


        String tempo= "Giorni:" + giorni + " Ore:" + ore + " minuti:" + minuti + " Secondi:" + secondiFinali;

        return tempo;


    }
}
