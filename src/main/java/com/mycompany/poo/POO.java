package com.mycompany.poo;

import processing.core.PApplet;
import models.Borde;
import models.cajas;
import models.Dimension;
import models.Posicion;
import models.triangulo;
import models.circulo;
import models.Figura;
        
public class POO extends PApplet{

    Borde borde;
    cajas caja1, caja2, caja3, caja4,caja5, caja6, caja7, caja8;
    triangulo triangulo1;
    circulo circulo1, circulo2;
    
    public static void main(String[] args) {
        PApplet.main("com.mycompany.poo.POO");
    }
    
    @Override
    public void settings() {
        size(config.ANCHO, config.ALTO);
    }
    
    Figura[] pinguino;
    
    @Override
    public void setup() {
        background(config.COLOR_FONDO);
        borde = new Borde();
        
        
        
        // Aqui creamos las cajas
        //Numeros bajos subir, numeros altos bajar
        // x, y, ancho, alto, color
        //Cuerpo
        caja1 = new cajas(200, 100, 400, 410, color(0, 0, 0));
        //Ojos blancos
        caja2 = new cajas(480, 220, 200, 200, color(255, 255, 255));      
        caja3 = new cajas(320, 220, 200, 200, color(255, 255, 255));
        //Ojitos
        caja4 = new cajas(400, 380, 250, 250, color(255, 255, 255));
        caja5 = new cajas(480, 200, 20, 20, color(0,0,0));
        //Panza
        caja6 = new cajas(320, 200, 20, 20, color(0,0,0));
        //Patitas
        caja7 = new cajas(320, 510, 60, 40, color(247, 208, 37));
        caja8 = new cajas(480, 510, 60, 40, color(247, 208, 37));
        //Pico
        // x1,y1 (izq), x2,y2 (der), x3,y3 (punta abajo), color
        triangulo1 = new triangulo(370, 290, 430, 290, 400, 250, color(247, 208, 37));
        //Aletas    
        // Ala izquierda (un poco más arriba del centro del cuerpo)
        circulo1 = new circulo(180, 300, 40, 120, color(0)); 
        // Ala derecha
        circulo2 = new circulo(620, 300, 40, 120, color(0));
        
        pinguino = new Figura[]{caja1, caja2, caja3, caja4, caja5, caja6, caja7, caja8, triangulo1, circulo1, circulo2};
    }
    
    @Override
    public void draw() {
        background(config.COLOR_FONDO);
        
        borde.setAncho(3); 
        borde.setColor(color(0));
        
        // Color y ancho de los bordes
        stroke(borde.getColor());
        strokeWeight(borde.getAncho());
        
        // Dibujar la estructura del pinguino
        fill(caja1.getColor());
        rect(caja1.getPosicion().getX(), 
             caja1.getPosicion().getY(), 
             caja1.getDimension().getAncho(), 
             caja1.getDimension().getAlto());
        
        

        // De aqui para abajo cambiamos de color debido al stroke
        stroke(255);
        fill(caja2.getColor());
        ellipse(caja2.getPosicion().getX(), 
             caja2.getPosicion().getY(), 
             caja2.getDimension().getAncho(), 
             caja2.getDimension().getAlto());
        
        fill(caja3.getColor());
        ellipse(caja3.getPosicion().getX(), 
             caja3.getPosicion().getY(), 
             caja3.getDimension().getAncho(), 
             caja3.getDimension().getAlto());
        
        fill(caja4.getColor());
        ellipse(caja4.getPosicion().getX(), 
             caja4.getPosicion().getY(), 
             caja4.getDimension().getAncho(), 
             caja4.getDimension().getAlto());
        
        stroke(0);      
        fill(caja5.getColor());
        ellipse(caja5.getPosicion().getX(), 
             caja5.getPosicion().getY(), 
             caja5.getDimension().getAncho(), 
             caja5.getDimension().getAlto());
        
        fill(caja6.getColor());
        ellipse(caja6.getPosicion().getX(), 
             caja6.getPosicion().getY(), 
             caja6.getDimension().getAncho(), 
             caja6.getDimension().getAlto());
        
        //Amarillo
        stroke(247, 208, 37);
        fill(caja7.getColor());
        ellipse(caja7.getPosicion().getX(), 
             caja7.getPosicion().getY(), 
             caja7.getDimension().getAncho(), 
             caja7.getDimension().getAlto());
        
        fill(caja8.getColor());
        ellipse(caja8.getPosicion().getX(), 
             caja8.getPosicion().getY(), 
             caja8.getDimension().getAncho(), 
             caja8.getDimension().getAlto());
        
        fill(triangulo1.getColor());
        triangle(triangulo1.getP1().getX(), triangulo1.getP1().getY(),
                triangulo1.getP2().getX(), triangulo1.getP2().getY(),
                triangulo1.getP3().getX(), triangulo1.getP3().getY());
        
        stroke(0);
        pushMatrix();
            translate(circulo1.getPosicion().getX(), circulo1.getPosicion().getY());
            rotate(radians(30)); // Inclinada hacia afuera
            fill(circulo1.getColor());
            stroke(0); // Borde negro
            ellipse(0, 0, circulo1.getDimension().getAncho(), circulo1.getDimension().getAlto());
        popMatrix();

        // --- ALA DERECHA ---
        pushMatrix();
            translate(circulo2.getPosicion().getX(), circulo2.getPosicion().getY());
            rotate(radians(-30)); // Inclinada hacia el otro lado
            fill(circulo2.getColor());
            stroke(0);
            ellipse(0, 0, circulo2.getDimension().getAncho(), circulo2.getDimension().getAlto());
        popMatrix();
        
        for (Figura f : pinguino) {
            f.mover(1, 1);
        }
    }     
}