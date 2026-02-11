package models;

public class triangulo extends Figura {
    
    private Posicion p2, p3;

    public triangulo(float x1, float y1, float x2, float y2, float x3, float y3, int color) {
        super(x1, y1, 0, 0, color); // p1 es la posicion de Figura
        this.p2 = new Posicion(x2, y2);
        this.p3 = new Posicion(x3, y3);
    }
    
    @Override
    public void mover(float dx, float dy) {
        super.mover(dx, dy); // mueve p1

        p2.setX(p2.getX() + dx);
        p2.setY(p2.getY() + dy);

        p3.setX(p3.getX() + dx);
        p3.setY(p3.getY() + dy);
    }

    // Getters
    public Posicion getP1() {
        return getPosicion(); // p1 viene de Figura
    }

    public Posicion getP2() {
        return p2;
    }

    public Posicion getP3() {
        return p3;
    }
}
