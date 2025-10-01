package PracticaLab4;

import java.util.Random;

public class AppFigura {
    public static void main(String[] args) {
        Random random = new Random();
        Figura[] figuras = new Figura[5];

        for (int i = 0; i < figuras.length; i++) {
            int tipo = random.nextInt(2) + 1;
            String color = (tipo == 1) ? "Rojo" : "Azul";

            if (tipo == 1) {
                double lado = random.nextInt(10) + 1;
                figuras[i] = new Cuadrado(color, lado);
            } else {
                double radio = random.nextInt(10) + 1;
                figuras[i] = new Circulo(color, radio);
            }
        }

        for (Figura f : figuras) {
            System.out.println(f.toString());

            if (f instanceof Coloreado) {
                Coloreado c = (Coloreado) f;
                System.out.println("Método Coloreado: " + c.comoColorear());
            }

            System.out.println("-----------------------");
        }
    }
}
