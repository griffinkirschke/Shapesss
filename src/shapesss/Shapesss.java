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
public class Shapesss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testCircle();
        testRectangle();
    }

    private static void testCircle() {
        Circle myCircle = new Circle();
        myCircle.setRadius(5.5);
        
        System.out.println("Circle");
        System.out.printf("    radius = %.2f \n", myCircle.getRadius());
        
        System.out.printf("    Diameter = %.2f \n", myCircle.getDiameter());
        
        System.out.printf("    Circumference = %.2f \n", myCircle.getCircumference());
        
        System.out.printf("    Area  = %.2f \n", myCircle.getArea());
}

    private static void testRectangle() {
        Rectangle myRectangle = new Rectangle();
        myRectangle.setLength(5.5);
        myRectangle.setWidth(7.0);
        
        System.out.println("Rectangle");
        System.out.printf("    Area = %.2f \n", myRectangle.getArea());
        
        System.out.printf("    Perimeter = %.2f \n", myRectangle.getPerimeter());
        
    }
}