public class Produto {

    protected static long nextSeqNum = 1;
    protected int pesoEmGramas;
    protected float preçoEmReais;
    protected String categoria;
    protected int quantidadeEmEstoque;


    protected final long id;  // identificador único (sequencial) deste objeto

    public Produto(int peso, float preço, String categoria) {
        this.id = nextSeqNum++;
        this.pesoEmGramas = peso;
        this.preçoEmReais = preço;
        this.categoria = categoria;


    }

    public void setQuantidadeEmEstoque (int x){
        this.quantidadeEmEstoque += x;
    }
    public int getQuantidadeEmEstoque(){
        return this.quantidadeEmEstoque;
    }

    public float getPreçoEmReais(){
        return this.preçoEmReais;
    }

    public long getId() {
        return this.id;
    }

    public String getCategoria(){
        return this.categoria;
    }
}
