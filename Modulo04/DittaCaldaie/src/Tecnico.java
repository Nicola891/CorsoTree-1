public class Tecnico {
    // MARCO, GIOVANNI, PAOLO, GIANFRANCIOSCO

    String nome;
    String newName;
    Riparazione riparazione;
    private StatoRiparazioni stato;
    private StatoTecnico stato1;

    public Tecnico(String nome, Riparazione riparazione, StatoRiparazioni stato) { //COSTRUTTORE
        this.nome = nome;
        this.riparazione = riparazione;
        this.stato = stato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNewName(){
        return newName;
    }


    public Riparazione getRiparazione() {
        return riparazione;
    }

    public void setRiparazione(Riparazione nuovaRiparazione) {
        this.riparazione = nuovaRiparazione;
        if(riparazione != null)
            stato = StatoRiparazioni.IN_CORSO;
    }

    //public void terminaRiparazione() {
    //    if(riparazione != null)
    //        stato = StatoRiparazioni.CONCLUSA;
    //}

    public StatoTecnico getStatoTecnico() {
        if(stato1 != StatoTecnico.OCCUPATO)
            return StatoTecnico.LIBERO;
        else
            return StatoTecnico.OCCUPATO;
    }
}

