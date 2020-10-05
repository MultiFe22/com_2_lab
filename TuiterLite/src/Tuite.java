import java.util.ArrayList;

public class Tuite<T> {

    private final Usuario autor;
    private final String texto;
    private T anexo;

    // hashtags?
    // objeto anexado?

    public Tuite(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public void anexarAlgo(T anexo) {
        this.anexo = anexo;
    }

    public Object getAnexo() {
        return this.anexo;
    }

    public Usuario getAutor() {
        return this.autor;
    }

    public String getTexto() {
        return this.texto;
    }

    public ArrayList<String> getHashtags() {
        ArrayList<String> hashtags = new ArrayList<String>();
        int hash = 0;
        for(int i = 0; i < this.texto.length(); i++ ){
            if(Character.compare(texto.charAt(i), '#') == 0){
                hash = i+1;
            }
            if(hash > 0 && ( Character.isWhitespace(texto.charAt(i)) || i == texto.length()-1 )){
                if(i == texto.length()-1){
                    hashtags.add(this.texto.substring(hash-1, i+1));
                    hash = 0;
                }
                else {
                    hashtags.add(texto.substring(hash-1, i ));
                    hash = 0;
                }
            }
        }
        return hashtags;
    }
}
