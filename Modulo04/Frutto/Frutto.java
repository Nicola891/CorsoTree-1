package Frutto;

public abstract class Frutto {

    private Colore colore;
    private boolean contaSemi;

    public Frutto(Colore colore, boolean contaSemi) {
        this.colore = colore;
        this.contaSemi = contaSemi;
    }

    public Colore getColore() {
        return colore;
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }

    public boolean contaSemi() {
        return contaSemi;
    }

    public void setContaSemi(boolean contaSemi) {
        this.contaSemi = contaSemi;
    }
}
