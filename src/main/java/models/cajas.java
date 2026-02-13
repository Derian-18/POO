package models;
import processing.core.PApplet;

public class cajas extends Figura {

    // Constructor completo
    public cajas(Posicion posicion, Dimension dimension, int color) {
        super(posicion, dimension, color);
    }

    // Constructor simplificado
    public cajas(float x, float y, float ancho, float alto, int color) {
        super(new Posicion(x, y), new Dimension(ancho, alto), color);
    }

    @Override
    public void dibujar(PApplet app){
        app.fill(getColor());
        app.rect(
            getPosicion().getX(),
            getPosicion().getY(),
            getDimension().getAncho(),
            getDimension().getAlto()
        );
    }
}
