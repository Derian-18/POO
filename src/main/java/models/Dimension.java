package models;

public class Dimension {
    private float ancho;
    private float alto;
    
    public Dimension(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    // Constructor por defecto
    public Dimension() {
        this(0, 0);
    }
    
    // Getters
    public float getAncho() {
        return ancho;
    }
    
    public float getAlto() {
        return alto;
    }
    
    // Setters
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
    public void setAlto(float alto) {
        this.alto = alto;
    }
    
    // Métodos útiles
    public float area() {
        return ancho * alto;
    }
    
    public boolean esValida() {
        return ancho >= 0 && alto >= 0;
    }
    
    @Override
    public String toString() {
        return "Dimension[" + ancho + "x" + alto + "]";
    }
}
