package model;

public class Insect extends Animal{
    private boolean nocturnal;
    private boolean winged;

    public boolean getNocturnal() {
        return nocturnal;
    }
    public boolean getWinged() {
        return winged;
    }

    public void setNocturnal(boolean nocturnal){
        this.nocturnal = nocturnal;
    }
    public void setWinged(boolean winged){
        this.winged = winged;
    }
}
