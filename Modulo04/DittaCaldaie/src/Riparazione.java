public class Riparazione {
    private String indirizzo;
    private int priorità;
    private StatoRiparazioni stato;

    public Riparazione (String indirizzo,int priorità, StatoRiparazioni stato) { //COSTRUTTORE
        this.indirizzo=indirizzo;
        this.priorità=priorità;
        this.stato = stato;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        //controllo se l'inidrizzo è valido
        this.indirizzo = indirizzo;
    }

    public int getPrioriotà() {
        return priorità;
    }

    public void setPrioriotà(int prioriotà) {
        this.priorità = prioriotà;
    }

    public int getPriorità() {
        return priorità;
    }

    public void setPriorità(int priorità) {
        this.priorità = priorità;
    }

    public StatoRiparazioni getStato() {
        return stato;
    }

    public void setStatoRiparazioni(StatoRiparazioni stato) {
        this.stato = stato;
    }

    public StatoRiparazioni getStatoRiparazioni(){
        return StatoRiparazioni.CONCLUSA;
    }
}
