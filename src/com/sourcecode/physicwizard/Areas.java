package com.sourcecode.physicwizard;

/**
 * This class calculates the areas of different geometrical figures.
 *
 * @author Vitor Sousa
 */
public class Areas {

    public Areas() {
    }

    /**
     * Calculates the area of a square
     *
     * @param side
     * @return the square's area
     */
    double areaQuadrado(double side) {
        return side * side;
    }

    /**
     * Calculates the area of a rectangle
     *
     * @param larg
     * @param comp
     * @return the rectangle's area
     */
    double areaRectangulo(double larg, double comp) {
        return larg * comp;
    }

    /**
     * Calculates the area of a rhombus
     *
     * @param bigDiagonal
     * @param smallDiagonal
     * @return the rhombus' area
     */
    double areaLosango(double bigDiagonal, double smallDiagonal) {
        return bigDiagonal * smallDiagonal / 2;
    }

    /**
     * Calculates the area of a triangle
     *
     * @param base
     * @param altura
     * @return the triangle's area
     */
    double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    /**
     * Calculates the area of a circle
     *
     * @param raio
     * @return the circle's area
     */
    double areaCirculo(double raio) {
        return raio * raio * Math.PI;
    }

    /**
     * Calculates the area of a spherical surface
     *
     * @param raio
     * @return the sphere's area
     */
    double areaEsfera(double raio) {
        return 4 * Math.PI * raio * raio;
    }

    /**
     * Calculates the area of a trapeze
     *
     * @param bMaior
     * @param bMenor
     * @param altura
     * @return the trapeze's area
     */
    double areaTrapezio(double bMaior, double bMenor, double altura) {
        return (bMaior + bMenor) * (altura / 2);
    }
}
