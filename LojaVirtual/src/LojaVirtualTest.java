import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LojaVirtualTest {
    private LojaVirtual loja;

    @Before
    public void setup(){
        loja = new LojaVirtual();


    }
    @Test
    public void testarIncluirNoEstoque(){
        Roupa camiseta_azul = new Roupa(30, (float) 40.0,'p', "azul");
        Livro java = new Livro(200, (float) 100.0, 212, 2020,"Java", "Gusmão" );

        loja.incluirProdutoNoEstoque(camiseta_azul, 20 );
        loja.incluirProdutoNoEstoque(java, 3);
        assertEquals(23, loja.getTamanhoEstoque());
        assertEquals(20, loja.getTamanhoEstoque(camiseta_azul));
        assertEquals(3, loja.getTamanhoEstoque(java));


    }

    @Test
    public void testarVenda(){
        Roupa camiseta_azul = new Roupa(30, (float) 40.0,'p', "azul");
        Livro java = new Livro(200, (float) 100.0, 212, 2020,"Java", "Gusmão" );
        loja.incluirProdutoNoEstoque(camiseta_azul, 20 );
        loja.incluirProdutoNoEstoque(java, 3);
        loja.efetuarVenda(camiseta_azul, 4);
        assertEquals(160.0, loja.getTotalValorVendas(), 0f);
        assertEquals(19, loja.getTamanhoEstoque());
        assertEquals(16, loja.getTamanhoEstoque(camiseta_azul));

    }

}