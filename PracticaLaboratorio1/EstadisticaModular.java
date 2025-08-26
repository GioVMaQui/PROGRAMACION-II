package PracticaLaboratorio1;

import java.util.Scanner;

public class EstadisticaModular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < datos.length; i++) {
            datos[i] = scanner.nextDouble();
        }

        double promedio = calcularPromedio(datos);
        double desviacion = calcularDesviacion(datos, promedio);

        System.out.printf("El promedio es %.2f\n", promedio);
        System.out.printf("La desviación estándar es %.5f\n", desviacion);
    }

    public static double calcularPromedio(double[] datos) {
        double suma = 0;
        for (double x : datos) {
            suma += x;
        }
        return suma / datos.length;
    }

    public static double calcularDesviacion(double[] datos, double promedio) {
        double suma = 0;
        for (double x : datos) {
            suma += Math.pow(x - promedio, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }
}

