package models;

public class triangulo {
    private Posicion p1, p2, p3;
    private int color;
    
    public triangulo(Posicion p1, Posicion p2, Posicion p3, int color){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = color;
    }
            
    public triangulo(float x1, float y1, float x2, float y2, float x3, float y3, int color){
        this.p1 = new Posicion(x1, y1);
        this.p2 = new Posicion(x2, y2);
        this.p3 = new Posicion(x3, y3);
        this.color = color;
    }
    
    // Getters y setters
    public Posicion getP1() { return p1; }
    public Posicion getP2() { return p2; }
    public Posicion getP3() { return p3; }
    public int getColor() { return color; }
}
