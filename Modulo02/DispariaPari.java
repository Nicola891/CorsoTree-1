import java.util.Arrays;

public class DispariaPari {
    /* Scrivete una funzione che dato un array di valori ne restituisce una copia dove i numeri dispari
       sono stati moltiplicati per 2. */
    public static void main(String[] args) {

        //int[] arrayDispari = new int[5]
        int[] arrayDispari = {1,2,3,4,5};
        System.out.println(Arrays.toString(disparipari(arrayDispari)));

    }

    public static int[] disparipari(int[] arrayDispari){

        int[] arrayPari = new int[arrayDispari.length];

        for(int i=0; i< arrayDispari.length; i++) {

            if(arrayDispari[i]%2 != 0){
                arrayPari[i]=arrayDispari[i]*2;
            }else{
                arrayPari[i]=arrayDispari[i];
            }

        }

        return arrayPari;
    }
}
