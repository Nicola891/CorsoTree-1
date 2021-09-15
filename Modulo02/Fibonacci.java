public class Fibonacci {
    /* Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci
       nella quale ogni numero è definito dalla somma dei due precedenti
       eccetto i primi due che sono per definizione 0 e 1.
       Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via.
       Assumete di iniziare da 0,dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via */
    public static void main(String[] args) {


        System.out.println(fibonacci(10400));

    }

    public static int fibonacci(int numero){

        if(numero<0)
            return -1;
        if(numero==1)
            return 0;

        int[] fibonacci= new int[numero];

        fibonacci[0]=0;
        fibonacci[1]=1;

        for(int i=2; i< fibonacci.length; i++){

            fibonacci[i]=fibonacci[i-2]+fibonacci[i-1]; //numero definito dalla somma dei due precedenti

        }

        return fibonacci[numero-1];

    }

}
