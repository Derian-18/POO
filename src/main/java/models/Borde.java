package models;

public class Borde {

    private int ancho;
    private int color;

    public Borde(){
    this.ancho = 5;
    this.color = 0;
}
    
    public void setAncho(int ancho) {
        if (ancho<10){
        this.ancho = ancho;
}
        else{
            System.err.println("error");
        }
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getAncho() {
        return this.ancho;
    }
    
    public int getColor() {
        return this.color;
    }
}
