package com.thealgorithms.maths;

/**
 * @author <a href="https://github.com/skmodi649">Suraj Kumar Modi</a>
 * Se te da un número n. Necesitas encontrar la raíz digital de n.
 * La raíz digital de un número es la suma recursiva de sus dígitos hasta que obtenemos un número de un solo dígito.
 *
 * Caso de Prueba 1:
 * Entrada:
 * n = 1
 * Salida: 1
 * Explicación: La raíz digital de 1 es 1
 *
 * Caso de Prueba 2:
 * Entrada:
 * n = 99999
 * Salida: 9
 * Explicación: La suma de dígitos de 99999 es 45
 * que no es un número de un solo dígito, por lo tanto
 * la suma de dígitos de 45 es 9 que sí es un número
 * de un solo dígito.
 * 
 * Algoritmo:
 * Paso 1: Definir un método raizDigital(int n)
 * Paso 2: Definir otro método sumaDigitos(int n)
 * Paso 3: El método raizDigital(int n) toma la salida de sumaDigitos(int n) como entrada
 * si(sumaDigitos(int n) <= 9)
 *     retornar sumaDigitos(n)
 * sino
 *     retornar raizDigital(sumaDigitos(n))
 * Paso 4: sumaDigitos(int n) calcula la suma de los dígitos del número n recursivamente
 * si(n <= 9)
 *     retornar n;
 * sino
 *     retornar (n % 10) + sumaDigitos(n / 10)
 * Paso 5: En el método principal simplemente tomar n como entrada y luego llamar a la función raizDigital(int n) e
 * imprimir el resultado
 */
final class RaizDigital {
    private RaizDigital() {
    }

    public static int raizDigital(int n) {
        if (sumaDigitos(n) <= 9) { // Si n ya es un dígito único, simplemente llamar al método sumaDigitos y
                                   // retornar el valor
            return sumaDigitos(n);
        } else {
            return raizDigital(sumaDigitos(n));
        }
    }

    /**
     * Complejidad Temporal: O((Número de Dígitos)^2) 
     * Complejidad de Espacio Auxiliar: O(Número de Dígitos) 
     * Restricciones: 1 <= n <= 10^7
     */

    // Esta función se usa para encontrar la suma de los dígitos del número
    public static int sumaDigitos(int n) {
        if (n <= 9) { // si n se vuelve menor que 10, entonces retornar n
            return n;
        } else {
            return (n % 10) + sumaDigitos(n / 10); // n % 10 para extraer dígitos uno por uno
        }
    } // n / 10 es el número obtenido después de remover el dígito uno por uno
    // La suma de dígitos se almacena en la memoria de pila y luego finalmente se retorna
}