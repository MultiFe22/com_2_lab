public class Livro extends Produto {

    private final int quantPaginas;
    private final int anoDePublicacao;
    private final String titulo;
    private final String autor;

    public Livro(int peso, float preço, int pags, int ano, String titulo, String autor) {
        super(peso, preço,"Publicações");
        this.quantPaginas = pags;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = ano;
    }

    @Override
    public String toString() {
        return String.format("Livro com id %d, contendo %d paginas",
                this.id, this.quantPaginas);

        // ou...
        //        return "Livro com id " + this.id + ", contendo " + quantPaginas;

    }
}
