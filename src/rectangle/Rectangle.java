/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author ESTUDIANTE
 */
public class Rectangle {

    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double perimeter (){
        return (2*base)+(2*height);
    }
    
    public double area (){
        return (base*height);
    }
}
