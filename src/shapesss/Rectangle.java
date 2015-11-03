/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesss;

/**
 *
 * @author Griffin Kirschke
 */
public class Rectangle {

    private double length;

    public double getLength() {
        return length;

    }

    private double width;

    public double getWidth() {
        return width;

    }

    public void setLength(double length) {
        this.length = length;

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;

    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
