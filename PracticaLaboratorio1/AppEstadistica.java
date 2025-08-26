package PracticaLaboratorio1;

import java.util.Scanner;

public class AppEstadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < datos.length; i++) {
            datos[i] = sc.nextDouble();
        }

        EstadisticaPOO estadisticaPOO = new EstadisticaPOO(datos);
        System.out.printf("El promedio es %.2f\n", estadisticaPOO.promedio());
        System.out.printf("La desviación estándar es %.5f\n", estadisticaPOO.desviacion());
    }
}
