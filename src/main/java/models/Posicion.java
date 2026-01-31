package models;

public class Posicion {
    private float x;
    private float y;
    
    public Posicion(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    // Constructor por defecto
    public Posicion() {
        this(0, 0);
    }
    
    // Getters
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
    // Setters
    public void setX(float x) {
        this.x = x;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    // Método para actualizar posición
    public void mover(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }
    
    @Override
    public String toString() {
        return "Posicion(" + x + ", " + y + ")";
    }
}
