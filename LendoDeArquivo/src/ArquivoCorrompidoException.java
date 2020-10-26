public class ArquivoCorrompidoException extends Exception {
    public int numLinhasInvalidas;
    public ArquivoCorrompidoException(int numLinhasInvalidas) {
        this.numLinhasInvalidas = numLinhasInvalidas;
        Principal.invalidas = this.numLinhasInvalidas;

    }
}
