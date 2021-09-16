package Contatore;

public class Contatore {

    /* campo*/
    private double valoreAttuale; //istanziare la classe con un valore iniziale
    //essendo un contatore dovrà avere un stato interno
    //(un numero attuale del conteggio)

    public Contatore() {       //per istanziare una classe senza il valore iniziale
        this.valoreAttuale = 0;//definiamo un costruttore senza niente
    }                        //però in questo caso dobbiamo inizializzare questo valore attuale

    //dato che è stato solo dichiarato e gli diamo zero come valore di default(valore iniziale)
    public Contatore(double valoreIniziale) { //per istanziare una classe con il valore iniziale
        this.valoreAttuale = valoreIniziale;  //devo creare un costruttore che ci permette di prendere
    }                                         //un valore iniziale in input e assegnare questo valore a valoreAttuale

    public double getValoreAttuale() { //per accedere al valore attuale dobbiamo fare un metodo get e set
        return valoreAttuale;          //che permettono di far ritornare il valore o permetterci di
    }                                  //reimpostarlo ad un nuovo valore

    public void setValoreAttuale(double nuovoValore) {
        this.valoreAttuale = nuovoValore;
    }

    public void incrementa(){                 //implementa l'incremento
        valoreAttuale++;                      //incrementa il vaore attuale
        //setValoreAttuale(valoreAttuale+1);
    }

    public void incrementa(double valore){    //incremento con un valore in input
        valoreAttuale += valore;
    }

    public void resetAZero() {  //dobbiamo permettere di resettare il conteggio a zero
        // this.valoreAttuale = 0; //facciamo un metodo void perchè non deve tornare nulla
        setValoreAttuale(0);    //vado ad impostare a zero il valore attuale con il metodo set
    }

    public void resetAValore(double valore){ //resetta il conteggio ad un nuovo valore passato in input
        setValoreAttuale(valore);            //cosi reimposto il valore facendo il reset a questo valore
    }
}