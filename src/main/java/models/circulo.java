package models;
import processing.core.PApplet;

public class circulo extends Figura {

    // Constructor completo
    public circulo(Posicion posicion, Dimension dimension, int color) {
        super(posicion, dimension, color);
    }

    // Constructor simplificado
    public circulo(float x, float y, float ancho, float alto, int color) {
        super(new Posicion(x, y), new Dimension(ancho, alto), color);
    }

    @Override
    public void dibujar(PApplet app) {

        app.fill(getColor());
        app.stroke(getColor());

        app.ellipse(
            getPosicion().getX(),
            getPosicion().getY(),
            getDimension().getAncho(),
            getDimension().getAlto()
        );
    }
}
