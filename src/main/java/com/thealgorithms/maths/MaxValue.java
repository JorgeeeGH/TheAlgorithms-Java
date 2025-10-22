package com.thealgorithms.maths;

public final class MaxValue {
    private MaxValue() {
    }
    /**
    * Devuelve el mayor de dos valores {@code int}. Es decir, el resultado es el
    * argumento más cercano al valor de {@link Integer#MAX_VALUE}. Si los
    * argumentos tienen el mismo valor, el resultado es ese mismo valor.
    *
    * @param a un argumento.
    * @param b otro argumento.
    * @return el mayor de {@code a} y {@code b}.
    * 
    * Nuevo cambio
    * Otro cambio
    * Otro cambio más
    */
    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
}
