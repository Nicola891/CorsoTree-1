import java.util.Scanner;

public class PariDispari {
    /*Dato un numero, stampare true se il numero è pari, false altrimenti.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number =sc.nextInt();
        checkEvenOdd(number);
    }

    private static void checkEvenOdd(int number) {
        //inserite qui il vostro codice

        if(number%2==0){
            System.out.println("true");
        }else {
            System.out.println("false");

        }
    }
}
