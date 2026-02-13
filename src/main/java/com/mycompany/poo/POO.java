   /* Jimenez Ramirez Derian Fernando
   11 de febrero del 2026
   Grupo: 08IDPRMA */

package com.mycompany.poo;

import processing.core.PApplet;

public class POO extends PApplet {

    private Pinguino miPinguino;

    public static void main(String[] args) {
        PApplet.main("com.mycompany.poo.POO");
    }

    @Override
    public void settings() {
        size(config.ANCHO, config.ALTO);
    }

    @Override
    public void setup() {
        miPinguino = new Pinguino(this);
    }

    @Override
    public void draw() {
        background(config.COLOR_FONDO);

        miPinguino.dibujar(this);

        // movimiento
        if (keyPressed) {

            if (key == 'a' || key == 'A') {
                miPinguino.moverHorizontal(-5, this);
            }

            if (key == 'd' || key == 'D') {
                miPinguino.moverHorizontal(5, this);
            }

            if (key == 'w' || key == 'W') {
                miPinguino.moverVertical(-5, this);
            }

            if (key == 's' || key == 'S') {
                miPinguino.moverVertical(5, this);
            }
        }
    }
}
