package PracticaLaboratorio1;

public class EstadisticaPOO {
    private double[] datos;

    public EstadisticaPOO(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double x : datos) {
            suma += x;
        }
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;
        for (double x : datos) {
            suma += Math.pow(x - prom, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }
}
