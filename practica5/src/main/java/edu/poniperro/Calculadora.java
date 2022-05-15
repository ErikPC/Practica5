package edu.poniperro;

import edu.poniperro.intefaces.ICalculadora;

public class Calculadora implements ICalculadora {

    /**
     * @param primerNum
     * @param segundoNum
     * @return double
     */
    @Override
    public double sumar(Double primerNum, Double segundoNum) {
        return primerNum + segundoNum;
    }

    /**
     * @param primerNum
     * @param segundoNum
     * @return double
     */
    @Override
    public double restar(Double primerNum, Double segundoNum) {
        return primerNum - segundoNum;
    }

    /**
     * @param primerNum
     * @param segundoNum
     * @return double
     */
    @Override
    public double multiplicar(Double primerNum, Double segundoNum) {
        return primerNum * segundoNum;
    }

    /**
     * @param primerNum
     * @param segundoNum
     * @return double
     */
    @Override
    public double dividir(Double primerNum, Double segundoNum) {
        return primerNum / segundoNum;
    }

}
