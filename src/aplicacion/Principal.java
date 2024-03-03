package Practica2.src.aplicacion;

import mates.Matematicas;

public class Principal {

    public static void main(String[] args) {
        long pasos = Integer.parseInt(args[0]);
        double pi = Matematicas.generarNumeroPiIterativo(pasos);
        System.out.println("El número PI es " + pi);
    }
}
