package Laboratorio3;
import java.util.Random;
import java.util.Scanner;
class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;
    protected Random random;
    protected Scanner scanner;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public boolean validaNumero(int num) {
        return (num >= 0 && num <= 10);
    }

    public void juega() {
        reiniciaPartida(3); // Reinicia con 3 vidas
        numeroAAdivinar = random.nextInt(11); // Número entre 0 y 10

        System.out.println("\n¡Bienvenido al juego Adivina el número!");
        System.out.println("Debes adivinar un número entre 0 y 10.");

        while (true) {
            System.out.print("Ingresa tu número: ");
            int intento = scanner.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Debe estar entre 0 y 10.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord(numeroDeVidas);
                break;
            } else {
                if (quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número a adivinar es mayor");
                    } else {
                        System.out.println("El número a adivinar es menor");
                    }
                    System.out.println("Te quedan " + numeroDeVidas + " vidas");
                } else {
                    System.out.println("¡Pierdes! El número era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}
