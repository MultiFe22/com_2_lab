import java.security.cert.TrustAnchor;

public class Album {

    public static final float PREENCHIMENTO_MINIMO_PARA_PERMITIR_AUTO_COMPLETAR = 0.9f;  // 90%

    private int totalFigurinhas;
    private int quantFigurinhasPorPacotinho;
    private boolean[] coladas;
    private int[] quantRepetidas;
    private int pacotesRecebibos;

    public Album(int totalFigurinhas, int quantFigurinhasPorPacotinho) {
        this.totalFigurinhas = totalFigurinhas;
        this.quantFigurinhasPorPacotinho = quantFigurinhasPorPacotinho;
        //System.out.println(this.totalFigurinhas);

        coladas = new boolean[totalFigurinhas];
        quantRepetidas = new int[totalFigurinhas];
        //System.out.println(this.coladas.length);

        // ToDo IMPLEMENT ME!!!

    }

    public void receberNovoPacotinho(Figurinha[] pacotinho) {
        // ToDo IMPLEMENT ME!!!
        for (int i = 0; i < pacotinho.length; i++) {
            Figurinha figurinha = pacotinho[i];
            if (this.coladas[figurinha.getPosicao()-1]) {
                this.quantRepetidas[figurinha.getPosicao()-1] += 1;
            }
            else{
                this.coladas[figurinha.getPosicao()-1] = true;
            }
            // faça alguma coisa com essa figurinha recebida
            // (uma boa ideia é armazená-la em algum tipo de estrutura)
        }

        // equivalentemente, usar um "for each"
        /*for (Figurinha figurinha : pacotinho) {

        } */
        this.pacotesRecebibos += 1;
        //System.out.println(this.pacotesRecebibos);

    }

    public int getTotalPacotinhosRecebidos() {
        // ToDo IMPLEMENT ME!!!
        return this.pacotesRecebibos;
    }

    /**
     * Termina de preencher o álbum, desde que ele já esteja preenchido além de certa fração
     * mínima definida em Album.PREENCHIMENTO_MINIMO_PARA_PERMITIR_AUTO_COMPLETAR.
     *
     * Se o álbum não estiver ainda completo o suficiente para isso, este método simplesmente
     * não faz nada.
     */
    public void encomendarFigurinhasRestantes() {
        if((float)this.totalFigurinhas*PREENCHIMENTO_MINIMO_PARA_PERMITIR_AUTO_COMPLETAR <= this.getQuantFigurinhasColadas()){
            for(int i = 0 ; i < totalFigurinhas; i++){
                this.coladas[i] = true;
            }
        }
        // ToDo IMPLEMENT ME!!!    (será preciso validar a regra dos 10%)
    }

    public boolean possuiFigurinhaColada(int posicao) {
        if(this.coladas[posicao-1]){
            return true;
        }
        else{
            return false;
        }
    }

    /*public boolean possuiFigurinhaColada(Figurinha figurinha) {  // overload
        if(this.coladas[figurinha.getPosicao()-1]){
            return true;
        }
        else{
            return false;
        }
    } */

    public boolean possuiFigurinhaRepetida(int posicao) {
        if(this.quantRepetidas[posicao-1]>0){
            return true;
        }
        else {
            return false;
        }
        // ToDo IMPLEMENT ME!!!
    }

    public boolean possuiFigurinhaRepetida(Figurinha figurinha) {  // overload
        return possuiFigurinhaRepetida(figurinha.getPosicao());
    }

    public int getQuantFigurinhasColadas() {
        int count = 0;
        for (int i = 0; i < totalFigurinhas; i++){

            if (this.coladas[i]){
                count++;
            }
        }
        // ToDo IMPLEMENT ME!!!
        return count;
        // só pra retornar alguma coisa, evitando ainda o loop infinito nos testes quebrados
    }

    public int getQuantFigurinhasRepetidas() {
        int count = 0;
        for(int i = 0; i < this.totalFigurinhas; i++){
            count += this.quantRepetidas[i];
        }
        // ToDo IMPLEMENT ME!!!
        return count;
    }

   public int getQuantFigurinhasFaltando() {
        // ToDo IMPLEMENT ME!!!
        return 0;
    }

}
