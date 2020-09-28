public class Roupa extends Produto {
    private final char tamanho;

    private final String cor;

    public Roupa(int peso, float preço, char tamanho, String cor){
        super(peso, preço, "Vestuário");
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public String toString(){
        return String.format("Roupa de tamanho %c e de cor %s",this.tamanho, this.cor);
    }
}
