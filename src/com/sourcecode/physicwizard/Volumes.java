package com.sourcecode.physicwizard;

/**
 * This class calculates volumes of different regular figures
 *
 * @author Vitor Sousa
 */
public class Volumes {

    /**
     * Calculates the volume of a cube
     *
     * @param side
     * @return
     */
    double volumeCubo(double side) {
        return side * side * side;
    }

    /**
     * Calculates the volume of a parallelepiped
     *
     * @param comp
     * @param larg
     * @param prof
     * @return
     */
    double volumeParalelipipedo(double comp, double larg, double prof) {
        return comp * larg * prof;
    }

    /**
     * Calculates the volume of a pyramid
     *
     * @param areaBase
     * @param altura
     * @return
     */
    double volumePiramide(double areaBase, double altura) {
        return (areaBase * altura) / 3;
    }

    /**
     * Calculates the volume of a cylinder
     *
     * @param raio
     * @param altura
     * @return
     */
    double volumeCilindro(double raio, double altura) {
        return Math.PI * raio * raio * altura;
    }

    /**
     * Calculates the volume of a cone
     *
     * @param raio
     * @param altura
     * @return
     */
    double volumeCone(double raio, double altura) {
        return (Math.PI * raio * raio * altura) / 3;
    }

    /**
     * Calculates the volume of a sphere
     *
     * @param raio
     * @return
     */
    double volumeEsfera(double raio) {
        return (4 * Math.PI * raio * raio * raio) / 3;
    }
}
