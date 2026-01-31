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
    
    // Métodos para movimiento
    public void mover(float dx, float dy) {
        posicion.mover(dx, dy);
    }
    
    // Verificar colisión
    public boolean colisionaCon(cajas otra) {
        float x1 = this.posicion.getX();
        float y1 = this.posicion.getY();
        float w1 = this.dimension.getAncho();
        float h1 = this.dimension.getAlto();
        
        float x2 = otra.posicion.getX();
        float y2 = otra.posicion.getY();
        float w2 = otra.dimension.getAncho();
        float h2 = otra.dimension.getAlto();
        
        return x1 < x2 + w2 && 
               x1 + w1 > x2 && 
               y1 < y2 + h2 && 
               y1 + h1 > y2;
    }
    
    @Override
    public String toString() {
        return "Caja[" + posicion + ", " + dimension + ", Color: " + color + "]";
    }
}
