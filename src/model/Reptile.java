package model;

public class Reptile extends Animal {
    private boolean Scales;
    private boolean shell;

    public boolean getScales(){
        return this.Scales;
    }
    public boolean getShell(){
        return this.shell;
    }

    public void setScales(boolean scales){
        this.Scales = scales;
    }
    public void setShell(boolean shell){
        this.shell = shell;
    }
}
