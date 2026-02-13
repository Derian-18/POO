package com.mycompany.poo;

import models.Figura;
import models.cajas;
import models.circulo;
import models.triangulo;
import processing.core.PApplet;

public class Pinguino {

    private cajas cuerpo;
    private triangulo pico;
    private circulo alaIzq, alaDer;

    private circulo ojoBlanco1, ojoBlanco2;
    private circulo ojoNegro1, ojoNegro2;
    private circulo panza;
    private circulo pata1, pata2;

    private Figura[] partes;

    public Pinguino(PApplet app){

        cuerpo = new cajas(200, 100, 400, 410, app.color(0));

        ojoBlanco1 = new circulo(480, 220, 200, 200, app.color(255));
        ojoBlanco2 = new circulo(320, 220, 200, 200, app.color(255));

        panza = new circulo(400, 380, 250, 250, app.color(255));

        ojoNegro1 = new circulo(480, 200, 20, 20, app.color(0));
        ojoNegro2 = new circulo(320, 200, 20, 20, app.color(0));

        pata1 = new circulo(320, 510, 60, 40, app.color(247,208,37));
        pata2 = new circulo(480, 510, 60, 40, app.color(247,208,37));

        pico = new triangulo(370, 290, 430, 290, 400, 250, app.color(247,208,37));

        alaIzq = new circulo(180, 300, 40, 120, app.color(0));
        alaDer = new circulo(620, 300, 40, 120, app.color(0));

        partes = new Figura[]{
            cuerpo,
            ojoBlanco1, ojoBlanco2,
            panza,
            ojoNegro1, ojoNegro2,
            pata1, pata2,
            pico,
            alaIzq, alaDer
        };
    }

    public void dibujar(PApplet app){
        for(Figura f : partes){
            f.dibujar(app);
        }
    }

    // movimeinto para arriba ya para abajo

    public void moverHorizontal(float vx, PApplet app) {

        float limiteIzq = alaIzq.getPosicion().getX() + vx;
        float limiteDer = alaDer.getPosicion().getX() + vx;

        if (limiteIzq > 0 && limiteDer < app.width) {
            for (Figura f : partes) {
                f.mover(vx, 0);
            }
        }
    }

    public void moverVertical(float vy, PApplet app) {

        float limiteSup = pico.getP3().getY() + vy;
        float limiteInf = pata1.getPosicion().getY() + pata1.getDimension().getAlto() + vy;

        if (limiteSup > 0 && limiteInf < app.height) {
            for (Figura f : partes) {
                f.mover(0, vy);
            }
        }
    }
}

