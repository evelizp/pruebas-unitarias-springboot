package Services.impl;

import Services.ServicioA;

public class ServicioAImpl implements ServicioA {
    @Override
    public int sumar(int a, int b) {
        return a+b;
    }
}
