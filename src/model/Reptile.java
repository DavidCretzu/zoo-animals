package model;

public class Reptile extends Animal {
    private boolean scales;
    private boolean shell;

    public boolean getScales(){
        return this.scales;
    }
    public boolean getShell(){
        return this.shell;
    }
    public void setScales(boolean scales){
        this.scales = scales;
    }
    public void setShell(boolean shell){
        this.shell = shell;
    }
}
