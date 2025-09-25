package Laboratorio3;

class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }

    public void actualizaRecord(int vidasRestantes) {
        if (vidasRestantes > record) {
            record = vidasRestantes;
            System.out.println("¡Nuevo récord!: " + record + " vidas restantes.");
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}