public class DittaRiparazioni {
    Riparazione[] listaRiparazioni;
    Tecnico[] listaTecnici;

    public DittaRiparazioni(int numMaxRiparazioni, int numMaxTecnici) {
        this.listaRiparazioni = new Riparazione[numMaxRiparazioni];
        this.listaTecnici = new Tecnico[numMaxTecnici];
    }

    public Riparazione[] getListaRiparazioni() {
        return listaRiparazioni;
    }

    public void setListaRiparazioni(Riparazione[] listaRiparazioni) {
        this.listaRiparazioni = listaRiparazioni;
    }

    public Tecnico[] getListaTecnici() {
        return listaTecnici;
    }

    public void setListaTecnici(Tecnico[] listaTecnici) {
        this.listaTecnici = listaTecnici;
    }

    public void aggiungiRiparazione(Riparazione riparazione) {
        // se c'è posto
        for (int i = 0; i < listaRiparazioni.length; i++) {
            Riparazione r = listaRiparazioni[i];
            //se il posto i è vuoto
            if (r == null) {
                listaRiparazioni[i] = riparazione;
                break;
            }
            //se gia esiste
            if (r.getIndirizzo().equalsIgnoreCase(riparazione.getIndirizzo()))
                break;
        }

    }

    public Riparazione[] riparazioniInAttesa() {
        Riparazione[] inAttesa = new Riparazione[listaRiparazioni.length];
        int countInAttesa = 0;
        //scorrere riparazioni
        for (int i = 0; i < listaRiparazioni.length; i++) {
            //controllo se è in attesa
            Riparazione r = listaRiparazioni[i];
            if (r.getStato() == StatoRiparazioni.ATTESA) {
                //in caso la aggiungo
                inAttesa[countInAttesa] = r;
                countInAttesa++;
            }
        }
        return inAttesa;
    }

    public Riparazione priorità() {
        Riparazione maxPriorità=listaRiparazioni[0];
        for (int i = 1; i < listaRiparazioni.length; i++){
            //controllo se non è null
            if(listaRiparazioni[i]!=null && listaRiparazioni[i].getPriorità()>maxPriorità.getPriorità())
                maxPriorità=listaRiparazioni[i];
        }
        return maxPriorità;
    }

    public boolean assegnazione(){
        //trovare un tecnico libero
        Tecnico tecnicoLibero = null;
        for (int i = 0; i < listaTecnici.length; i++) {
            if(listaTecnici[i].getStatoTecnico() == StatoTecnico.LIBERO) {
                tecnicoLibero = listaTecnici[i];
            }
        }
        if(tecnicoLibero == null)
            return false;

        //trovare la riparazione con maggior priorità in attesa [rileggetelo lentamente]
        Riparazione maxPriorità = priorità();

        //assegnare la riparazione e cambia stati
        maxPriorità.setStatoRiparazioni(StatoRiparazioni.IN_CORSO);
        tecnicoLibero.setRiparazione(maxPriorità);
        return true;
    }

    public boolean riparazioneConclusa(String nomeTecnico){
        //trovare il tecnico da nome
        Tecnico tecnico = null;
        for (int i = 0; i < listaTecnici.length; i++) {
            if(listaTecnici[i].getStatoTecnico() == StatoTecnico.OCCUPATO) {
                tecnico = listaTecnici[i];
            }
        }
        //prendere la riparazione e metterla conclusa

        Riparazione riparazioneInCorso = tecnico.getRiparazione();

        riparazioneInCorso.setStatoRiparazioni(StatoRiparazioni.CONCLUSA);
        tecnico.setRiparazione(null);
        return true;
    }

    public void aggiungiTecnico(Tecnico[] listaTecnici, Tecnico newName){

        //Tecnico[] listaTecnici = getListaTecnici();
        Tecnico[] listaTecniciAggiornata = new Tecnico[listaTecnici.length+1];
        //System.out.println("Aggiungi Tecnico alla ditta");
        for(int i = 0; i< listaTecnici.length; i++){
            listaTecniciAggiornata[i]=listaTecnici[i];
            listaTecnici=listaTecniciAggiornata;
        }
        System.out.println("Nuovo Tecnico: " +  newName.getNewName());
    }

    //public void remove(Tecnico nome) {
       // nome.getNome();
        //if(listaTecnici[i] == nome.getNome())
        //    return;
       // for (int i = 0; i < listaTecnici.length; i++) {
          //  if(listaTecnici[i] == nome.getNome())
     //   }
        //numeroValori--;
    //}

}


