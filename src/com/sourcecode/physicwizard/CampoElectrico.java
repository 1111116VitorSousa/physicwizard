package com.sourcecode.physicwizard;

/**
 * This class calculates differents paramethers related to the electric field
 * (electric field, charge, distance between charges...)
 *
 * @author Vitor Sousa
 */
public class CampoElectrico {
    /*
     * Constant values
     */
    //private double carga = 1.6*Math.pow(10, -19); //C

    private double constElectrica = 8.99 * Math.pow(10, 9);//(N.m^2)/C^2
    private double permVazio = 8.85 * Math.pow(10, -12); //F/m

    /**
     * Electric Force (N)
     */
    
        /**
         * Using Coulomb's Law is a law of physics describing the electrostatic
         * interaction between electrically charged particles
         *
         * @param q1
         * @param q2
         * @param dist
         * @return
         */
        double forcaElectricaCoulomb(double q1, double q2, double dist) {
            return (constElectrica * q1 * q2) / (dist * dist);
        }

        /**
         * Using a charge and in electric Field
         *
         * @param q
         * @param campo
         * @return
         */
        double forcaElectricaCampo(double q, double campo) {
            return q * campo;
        }

    /**
     * Electric Field (V/m ou N/C)
     */
        
        /**
         * Using a charge and its distance
         *
         * @param q
         * @param dist
         * @return
         */
        double campoElectricoCar(double q, double dist) {
            return (constElectrica * q) / (dist * dist);
        }

        /**
         * Using the voltage difference and the distance between points
         *
         * @param dV
         * @param dist
         * @return
         */
        double campoElectricoDDP(double dV, double dist) {
            return dV / dist;
        }

        /**
         * Using an infinite surface
         *
         * @param sup
         * @return
         */
        double campoElectricoSup(double sup) {
            return sup / (2 * permVazio);
        }

        /**
         * Usinga force and a charge
         *
         * @param q
         * @param F
         * @return
         */
        double campoElectricoFor(double q, double F) {
            return F / q;
        }

    /**
     * Electric Charge (C)
     */
        
        /**
         * Using electric force and electric field
         *
         * @param campo
         * @param forca
         * @return
         */
        double cargaElectricaCampoForca(double campo, double forca) {
            return forca / campo;
        }

        /**
         * Using Coulomb's Law with different charges
         *
         * @param q1
         * @param dist
         * @param forca
         * @return
         */
        double cargaElectricaCoulomb1(double q1, double dist, double forca) {
            return (forca * dist * dist) / (constElectrica * q1);
        }

        /**
         * Using Coulomb's Law with equal charges
         *
         * @param dist
         * @param forca
         * @return
         */
        double cargaElectricaCoulomb2(double dist, double forca) {
            return Math.sqrt((forca * dist * dist) / constElectrica);
        }

        /**
         * Using the electric field and the distance
         *
         * @param campo
         * @param dist
         * @return
         */
        double cargaElectricaCampo(double campo, double dist) {
            return (campo * dist * dist) / constElectrica;
        }

        /**
         * Using the electric potential and the distance
         *
         * @param potencial
         * @param dist
         * @return
         */
        double cargaElectricaPotencial(double potencial, double dist) {
            return (potencial * dist) / constElectrica;
        }

        /**
         * Using the Electrical Potential Energy and the voltage
         *
         * @param energia
         * @param potencial
         * @return
         */
        double cargaElectricaEnergia(double energia, double potencial) {
            return energia / potencial;
        }

        /**
         * Using the work and the electric potential
         *
         * @param trabalho
         * @param ddp
         * @return
         */
        double cargaElectricaTrabalho1(double trabalho, double ddp) {
            return trabalho / ddp;
        }

        /**
         * Using the work and the difference between two electric potentials
         *
         * @param trabalho
         * @param vA
         * @param vB
         * @return
         */
        double cargaElectricaTrabalho2(double trabalho, double vA, double vB) {
            return trabalho / (vA - vB);
        }

    /**
     * Electric Potential (V)
     */
        
        /**
         * Using the electric field and distance
         *
         * @param campo
         * @param dist
         * @return
         */
        double potencialCampoDistancia(double campo, double dist) {
            return campo * dist;
        }

        /**
         * Using a charge and the distance
         *
         * @param carga
         * @param dist
         * @return
         */
        double potencialCargaDistancia(double carga, double dist) {
            return constElectrica * carga / dist;
        }

        /**
         * Using potential energy and a charge
         *
         * @param energia
         * @param carga
         * @return
         */
        double potencialEnergiaCarga(double energia, double carga) {
            return energia / carga;
        }

        /**
         * Using a charge and work
         *
         * @param carga
         * @param trab
         * @return
         */
        double potencialCargaTrabalho(double carga, double trab) {
            return trab / carga;
        }
}
