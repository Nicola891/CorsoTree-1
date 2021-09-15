import java.util.Scanner;
public class Diagonale {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4]; //Istanzio matrice
        boolean valore = true;

        Scanner keyboard = new Scanner(System.in);

        //Riempio matrice
        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[0].length; col++)
                matrix[row][col] = keyboard.nextInt();

        //Stampo matrice sotto forma di matrice
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++)
                System.out.print(matrix[row][col] + " ");
            System.out.println();
        }

        System.out.println("Stampa la somma della diagonale da sinistra a destra" + sommaSinistraDestra(matrix));
        System.out.println("Stampa la somma della diagonale da sinistra a destra" + sommaDestraSinistra(matrix,valore));
    }

    public static int sommaSinistraDestra(int[][] matrix){
        int somma1 = 0;
        for(int row = 0; row < matrix.length; row++){
            somma1=somma1+matrix[row][row];
        }
        return somma1;
    }

    public static int sommaDestraSinistra(int[][] matrix, boolean valore) {
        int somma2 = 0;
        for (int row = 0; row < matrix.length; row++) {
            int col = matrix.length-1-row;
            somma2 = somma2 + matrix[row][col];
        }

        return somma2;
    }
}
