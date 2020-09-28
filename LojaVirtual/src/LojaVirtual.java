import java.util.ArrayList;

public class LojaVirtual {
    private ArrayList<Produto> estoque;
    private float totalValorVendas;
    private int tamanhoEstoque;

    public LojaVirtual(){
        estoque = new ArrayList<Produto>();

    }

    public int getTamanhoEstoque(){
        int tamanho = 0;
        for (Produto x : estoque){
            tamanho +=  x.getQuantidadeEmEstoque();
        }

        return tamanho;
    }

    public int getTamanhoEstoque(Produto produto){
        return produto.quantidadeEmEstoque;
    }

    public void incluirProdutoNoEstoque(Produto produto, int quantidade){
        produto.setQuantidadeEmEstoque(quantidade);
        this.estoque.add(produto);

    }

    public String efetuarVenda(Produto produto, int quantidade){
        for(Produto x : estoque){
            if(x.getId() == produto.getId()){
                if(x.getQuantidadeEmEstoque() >= quantidade){
                    if(receberPagamento((float)(quantidade*x.getPreçoEmReais()))){
                        x.setQuantidadeEmEstoque(-quantidade);
                        break;
                    }
                }
                else{
                    return null;
                }
            }
            else{
                return null;
            }
        }

        return String.format("Categoria do Item: %s\nQuantidade: %d\nPreço unitário: %f\nPreço total: %f", produto.getCategoria(),
                quantidade ,produto.getPreçoEmReais(), (float) produto.getPreçoEmReais()*quantidade);
    }

    public float getTotalValorVendas(){
        return this.totalValorVendas;
    }

    private boolean receberPagamento(float valor){
        this.totalValorVendas += valor;
        return true;
    }

}


