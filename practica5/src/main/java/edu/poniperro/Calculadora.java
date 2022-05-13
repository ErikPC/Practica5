package edu.poniperro;

import edu.poniperro.intefaces.ICalculadora;

public class Calculadora implements ICalculadora {

    @Override
    public double sumar(Double primerNum, Double segundoNum) {
        return primerNum + segundoNum;
    }

    @Override
    public double restar(Double primerNum, Double segundoNum) {
        return primerNum - segundoNum;
    }

    @Override
    public double multiplicar(Double primerNum, Double segundoNum) {
        return primerNum * segundoNum;
    }

    @Override
    public double dividir(Double primerNum, Double segundoNum) {
        return primerNum / segundoNum;
    }

}
