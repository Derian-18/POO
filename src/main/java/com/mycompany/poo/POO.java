package com.mycompany.poo;

import processing.core.PApplet;
import models.Borde;
import models.cajas;
import models.Dimension;
import models.Posicion;

public class POO extends PApplet{

    Borde borde;
    cajas caja1, caja2;
    
    public static void main(String[] args) {
        PApplet.main("com.mycompany.poo.POO");
    }
    
    @Override
    public void settings() {
        size(config.ANCHO, config.ALTO);
    }
    
    @Override
    public void setup() {
        background(config.COLOR_FONDO);
        borde = new Borde();
        
        // Aqui creamos las cajas
        caja1 = new cajas(50, 50, 100, 100, color(150, 50, 0));
        caja2 = new cajas(200, 200, 80, 120, color(153, 136, 24)); 
    }
    
    @Override
    public void draw() {
        background(config.COLOR_FONDO);
        
        borde.setAncho(3);
        borde.setColor(color(0));
        
        stroke(borde.getColor());
        strokeWeight(borde.getAncho());
        
        // Dibujar caja1
        fill(caja1.getColor());
        rect(caja1.getPosicion().getX(), 
             caja1.getPosicion().getY(), 
             caja1.getDimension().getAncho(), 
             caja1.getDimension().getAlto());
        
        // Dibujar caja2
        fill(caja2.getColor());
        rect(caja2.getPosicion().getX(), 
             caja2.getPosicion().getY(), 
             caja2.getDimension().getAncho(), 
             caja2.getDimension().getAlto());
        
        // Mover caja1 con teclas
        if (keyPressed) {
            if (key == 'a') caja1.mover(-2, 0);
            if (key == 'd') caja1.mover(2, 0);
            if (key == 'w') caja1.mover(0, -2);
            if (key == 's') caja1.mover(0, 2);
        }
        
        // Verificar colisión
        if (caja1.colisionaCon(caja2)) {
            println("¡Colisión detectada!");
        }
    }
        
}
