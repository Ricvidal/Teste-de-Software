package com.testedesoftware.model;

/**
 *
 * @author ricardo
 */
public class Exercicio01 {

    public int Dobro(int x) {
        return x * 2;
    }

    public int Area(int x, int y) {
        return x * y;
    }

    public double Desconto(double x, double y) {
        return x - ((y / 100) * x);
    }

    public int Maior(int x, int y, int z) {

        if (x > y && x > z)  {
            return x;
        } else if (y > x && y > z)  {
            return y;
        } else {
            return z;
        }

    }

}
