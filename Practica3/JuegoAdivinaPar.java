package Laboratorio3;

class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) return false;
        if (num % 2 == 0) {
            return true;
        } else {
            System.out.println("Error: el número debe ser PAR entre 0 y 10.");
            return false;
        }
    }
}