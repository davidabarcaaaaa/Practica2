package Practica2.src.mates;

public class Matematicas {

    public static double generarNumeroPiRecursivo(long pasos, long puntosDentro, long totalPuntos) {
        if (pasos == 0) {
            return 4.0 * puntosDentro / totalPuntos;
        } else {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                puntosDentro++;
            }
            return generarNumeroPiRecursivo(pasos - 1, puntosDentro, totalPuntos + 1);
        }
    }

    // Método auxiliar para iniciar la recursividad
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivo(pasos, 0, 0);
    }
}

