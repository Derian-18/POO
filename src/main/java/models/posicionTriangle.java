package models;

public class posicionTriangle {
    private float x1, x2, x3;
    private float y1, y2, y3;
    
    public posicionTriangle(float x1, float y1, float x2, float y2, float x3, float y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    
    public posicionTriangle() {
        this(0,0,0,0,0,0);
    }
    
    //Getters y Setters
    
    // X
    
    public float getX1(){
        return x1;
    }
    
    public float getX2(){
        return x2;
    }
    
    public float getX3(){
        return x3;
    }
    
    // Y
    
    public float gety1(){
        return y1;
    }
    
    public float gety2(){
        return y2;
    }
    
    public float gety3(){
        return y3;
    }
    
    //Setters
    
    // X
    
    public void setx1(float x1){
        this.x1 = x1;
    }
    
    public void setx2(float x2){
        this.x2 = x2;
    }
    
    public void setx3(float x3){
        this.x3 = x3;
    }
}
