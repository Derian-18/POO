package models;

public class cajas {
    private Posicion posicion;
    private Dimension dimension;
    private int color;
    
    public cajas(Posicion posicion, Dimension dimension, int color) {
        this.posicion = posicion;
        this.dimension = dimension;
        this.color = color;
    }
    
    // Constructor simplificado
    public cajas(float x, float y, float ancho, float alto, int color) {
        this.posicion = new Posicion(x, y);
        this.dimension = new Dimension(ancho, alto);
        this.color = color;
    }
    
    
    
    // Getters
    public Posicion getPosicion() {
        return posicion;
    }
    
    public Dimension getDimension() {
        return dimension;
    }
    
    public int getColor() {
        return color;
    }
    
    // Setters
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    
    public void setColor(int color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Caja[" + posicion + ", " + dimension + ", Color: " + color + "]";
    }
}
