package Clases;

public class Motor {

    private int litrosAceite, cv;

    public Motor(int cv){
        this.cv = cv;

    }
    public Motor(int cv, int litrosAceite){
        this.cv = cv;
        this.litrosAceite = litrosAceite;

    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return cv;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }
}
