public class Fracao {

    /**
     * Construtor.
     * O sinal da fração é passado no parâmetro específico.
     *
     * @param numerador O numerador (inteiro não-negativo)
     * @param denominador O denominador (inteiro positivo)
     * @param positiva se true, a fração será positiva; caso contrário, será negativa
     */

    int numerador, denominador;
    boolean positiva;
    int sinal;



    public Fracao(int numerador, int denominador, boolean positiva) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.positiva = positiva;
        if (this.positiva){
            this.sinal = 1;
        }
        else {
            this.sinal = -1;
        }
        // ToDo IMPLEMENT ME!!!


    }
    private int Euclides(){
        int resto;
        int a, b;
        if (this.numerador > this.denominador){
            a = this.numerador;
            b = this.denominador;
        }
        else {
            b = this.numerador;
            a = this.denominador;
        }
        while(b!=0){
            resto = a%b;
            a = b;
            b = resto;
        }
        return a;
    }

    /**
     * @return um double com o valor numérico desta fração
     */
    public double getValorNumerico() {


        return this.sinal*((double)this.numerador/(double)this.denominador);  // ToDo IMPLEMENT ME!!!
    }

    /**
     * Retorna uma fração que é equivalente a esta fração (this),
     * e que é irredutível (numerador e denominador primos entre si).
     * Em outras palavras, retorna a fração geratriz desta fração.
     *
     * @return uma fração irredutível equivalente a esta;
     *         no caso desta fração JÁ SER ela própria irredutível, retorna this
     */
    public Fracao getFracaoGeratriz() {
        int div = Euclides();
        if (div == 1){
            return this;
        }
        else{
            Fracao novo = new Fracao(this.numerador/div, this.denominador/div, this.positiva);
            return novo;
        }
          // ToDo IMPLEMENT ME!!!
    }

    public int getNumerador() {
        return this.numerador;  // ToDo IMPLEMENT ME!!!
    }

    public int getDenominador() {
        return this.denominador;  // ToDo IMPLEMENT ME!!!
    }

    public boolean isPositiva() {
        if (this.getNumerador() == 0){
            return false;
        }
        return this.positiva;  // ToDo IMPLEMENT ME!!!
    }
    @Override
    public boolean equals(Object o) {
        Fracao o1 = (Fracao) o;
        if(o1.getNumerador()  == 0 && this.getNumerador() == 0){
            return true;
        }
        if( o1.getFracaoGeratriz().getNumerador() == this.getFracaoGeratriz().getNumerador() && o1.getFracaoGeratriz().getDenominador() == this.getFracaoGeratriz().getDenominador() && o1.isPositiva() == this.isPositiva() ){
            return true;
        }
        else {
            return false;
        }
    }

}
